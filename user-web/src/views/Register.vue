<template>
  <div>
    <van-nav-bar
      left-text="返回"
      @click-left="login"
      left-arrow
    />
    <div style="height:80px; weight:80px; display:flex;margin-top:30px;">
      <img src="../assets/logo.png" style="margin:auto;height:80px;" />
    </div>
    <van-form @submit="onSubmit">
      <van-field v-model="phone" type="tel" name="手机" label="手机" placeholder="手机" />
      <van-field v-model="code" center clearable label="验证码" placeholder="请输入短信验证码">
        <template #button>
          <van-button
            v-if="countdown==10"
            size="mini"
            :disabled="phone=='' || !(/^1[3456789]\d{9}$/.test(phone))"
            type="primary"
            @click="getCode"
          >获取验证码</van-button>
          <van-button
            v-if="countdown<10"
            size="mini"
            :disabled="countdown!=10 "
            type="primary"
            @click="getCode"
          >{{countdown}}S..</van-button>
        </template>
      </van-field>
      <div style="margin: 16px;">
        <van-button
          :disabled="phone=='' || code==''"
          round
          block
          type="info"
          native-type="submit"
        >注册</van-button>
      </div>
    </van-form>
  </div>
</template>

<script>
export default {
  data() {
    return {
      countdown: 10,
      phone: "",
      code: "",
    };
  },
  methods: {
      login(){
          this.$router.push("/login");
      },
    getCode() {
      this.countdown--;
      this.interval = setInterval(() => {
        this.countdown--;
        if (this.countdown <= 0) {
          this.countdown = 10;
          clearInterval(this.interval);
        }
      }, 1000);
    },
    onSubmit(values) {
      console.log("submit", values);
    },
  },
};
</script>

<style scoped>
.msmLogin {
  font-size: 12px;
  color: rgb(166, 192, 240);
}
.regAndGetPass {
  font-size: 12px;
  color: blueviolet;
}
</style>
