<template>
  <el-container class="container">
    <el-aside class="aside">
        <div class="myInfo">
          <my-info/>
        </div>
    </el-aside>
    <el-main class="main">
      <el-header class="header" style="background-color: white">
        <el-input
          placeholder="请输入内容"
          prefix-icon="el-icon-search"
          v-model="search" style="margin-top: 10px; width: 80%; float: left">
        </el-input>
      </el-header>


      <div v-for="blog in blogList">
        <BlogCell v-bind:content="blog"></BlogCell>
      </div>

      <el-footer style="background-color: white">
        <el-button round style="margin-top: 10px; margin-right: 40px;">上一页</el-button>
        <el-button round style="margin-top: 10px; margin-left: 40px;">下一页</el-button>
      </el-footer>
    </el-main>
  </el-container>
</template>

<script>
  import MyInfo from "./Myinfo";
  import BlogCell from "./BlogCell";
  export default {
    components: {BlogCell, MyInfo},
    data () {
      return {
        "blogList": [
          {
            title: "iOS动态库打包出现的问题",
            description: "在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。",
            dateDescrip: "一个月前发布"
          },
          {
            title: "一些iOS动态布局的问题",
            description: "在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。",
            dateDescrip: "5天前发布"
          },
          {
            title: "关于SpringBoot使用",
            description: "在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。",
            dateDescrip: "3天前发布"
          },
          {
            title: "VUE的开发入门",
            description: "在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。",
            dateDescrip: "1小时前发布"
          },
          {
            title: "VUE的开发入门",
            description: "在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。在打包动态库的时候，经常会出现，使用静态库冲突的问题，具体这个问题在网上的解决方案都是两者打包。",
            dateDescrip: "1小时前发布"
          }
        ],
        "search":""
      }
    },

    created: function() {
      this.getBlogList();
    },

    methods: {
      getBlogList: function () {
        // let fly = new require("flyio");
        let Fly = require("flyio/src/node");
        let fly = new Fly;
        fly.config.baseURL = "http://127.0.0.1:5000/blog/";
        fly.post("getBlogList", {
          keyword: "",
          page: 0,
          pageSize: 10
        }, {
          method: "POST"
        }).then(function (response) {
          console.log("hello input in loop");
          let data = JSON.parse(response.data);
          for (let json in data["data"]["blogList"]) {
            console.log(json["blogId"]);
            console.log(json["title"]);
            console.log(json["subTitle"]);
            console.log(json["publicDate"]);
            console.log(json["dateDescrip"]);
          }
          console.log(data["data"])
        }).catch(function (err) {
          console.log(err)
        });
      },

      decodeDataToBlog: function (json) {

      }
    }
  }
</script>

<style scoped>


.container {
  height: 100vh;
}
.aside {
  height: 100vh;
  overflow: hidden;
  width: 30vw !important;
  position: relative;
  background: url('../assets/LeftBack.png');
  background-size: 100% 100%;
}
.myInfo {
  position: relative;
  top: 50%;
  transform: translateY(-50%);
}
.main {
  background-color: white;
  height: 100vh;
  margin: 0;
  padding: 0;
}

</style>
