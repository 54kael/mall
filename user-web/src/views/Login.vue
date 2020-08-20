<template>
  <div>
    <div style="height:80px; weight:80px; display:flex;margin-top:30px;">
      <img src="../assets/logo.png" style="margin:auto;height:80px;" />
    </div>
    <van-form @submit="onSubmit">
      <div v-if="loginMode==1">
        <van-field v-model="username" name="账号" label="账号" placeholder="用户名" />
        <van-field v-model="password" center clearable label="密码" placeholder="请输入密码">
          <template #button>
            <van-button size="mini" type="primary">忘记密码</van-button>
          </template>
        </van-field>
      </div>
      <div v-if="loginMode==2">
        <van-field v-model="phone" type="tel" name="手机" label="手机" placeholder="手机" />
        <van-field v-model="code" center clearable label="验证码" placeholder="请输入短信验证码">
          <template #button>
            <van-button v-if="countdown==10" size="mini" :disabled="phone=='' || !(/^1[3456789]\d{9}$/.test(phone))" type="primary" @click="getCode">获取验证码</van-button>
            <van-button v-if="countdown<10" size="mini" :disabled="countdown!=10 " type="primary" @click="getCode">{{countdown}}S..</van-button>
          </template>
        </van-field>
      </div>
      <div style="margin: 16px;">
        <van-button
        v-if="loginMode==1"
          :disabled="username=='' || password==''"
          round
          block
          type="info"
          native-type="submit"
        >登录</van-button>
                <van-button
        v-if="loginMode==2"
          :disabled="phone=='' || code==''"
          round
          block
          type="info"
          native-type="submit"
        >登录</van-button>
      </div>
    </van-form>
    <div style="display:flex; justify-content:space-between;width:343.33px;margin:auto">
      <div v-if="loginMode==1" class="msmLogin" @click="loginMode=2">短信登录</div>
      <div v-if="loginMode==2" class="msmLogin" @click="loginMode=1">账号密码登录</div>
      <div class="regAndGetPass">
        <router-link :to="{path: '/register'}">注册</router-link>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      countdown:10,
      loginMode: 1,
      username: "",
      password: "",
      phone: "",
      code: "",
    };
  },
  methods: {
    getCode(){
      this.countdown--;
      this.interval=setInterval(() => {
        this.countdown--;
        if(this.countdown<=0) {
          this.countdown=10;
          clearInterval(this.interval);
        };
      },1000)
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
