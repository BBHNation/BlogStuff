<template>
  <div class="myinfo">
    <img class="headImg" src="../assets/Head.png"/>
    <p>{{ blogName }}</p>
    <p>{{ blogEnglishName }}</p>
    <p class="content">{{ introContent }}</p>
  </div>
</template>

<script>
  export default {
    name: 'MyInfo',
    data() {
      return {
        "blogName": "",
        "blogEnglishName": "",
        "introContent":""
      }
    },
    created: function () {
      this.getMyInfo()
    },
    methods: {
      getMyInfo() {
        let Fly = require("flyio/src/node");
        let fly = new Fly;
        fly.config.baseURL = "http://127.0.0.1:5000/blog/";
        fly.post("getMyInfo").then((response) => {
          let json = JSON.parse(response.data);
          this.blogName = json["data"]["blogName"];
          this.blogEnglishName = json["data"]["blogEnglishName"];
          this.introContent = json["data"]["introContent"];
        }).catch((err) => {
          console.log(err)
        })
      }
    }
  }
</script>

<style scoped>
  .headImg {
    width: 25%;
    margin-bottom: 10px;
  }
  p {
    color: aliceblue;
    margin: 0;
  }
  .content {
    color: aliceblue;
    width: 80%;
    margin-left: auto;
    margin-right: auto;
    text-align: left;
    margin-top: 30px;
  }
</style>
