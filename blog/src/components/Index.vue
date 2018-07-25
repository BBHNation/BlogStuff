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
        <BlogCell v-bind:content="blog" v-on:click="getDetail"></BlogCell>
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
    name: "Index",
    components: {BlogCell, MyInfo},
    data () {
      return {
        "blogList": [],
        "search":""
      }
    },

    created: function() {
      this.getBlogList();
    },

    methods: {
      getDetail: function() {
        console.log("detail")
      },
      getBlogList: function () {
        let Fly = require("flyio/src/node");
        let fly = new Fly;
        fly.config.baseURL = "http://127.0.0.1:5000/blog/";
        fly.post("getBlogList", {
          keyword: "",
          page: 0,
          pageSize: 10
        }, {
          method: "POST"
        }).then((response) => {
          console.log("hello input in loop");
          let data = JSON.parse(response.data);
          for (let json in data["data"]["blogList"]) {
            let blog = data["data"]["blogList"][json];
            let model = {
              title: blog["title"],
              description: blog["description"],
              dateDescrip: blog["dateDescrip"]
            };

            this.blogList.push(model);
          }
        }).catch(function (err) {
          console.log(err)
        });
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
