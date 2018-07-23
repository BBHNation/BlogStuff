<template>
  <el-container class="container">
    <el-aside class="aside">
        <div class="myinfo">
          <my-info/>
        </div>
    </el-aside>
    <el-main class="main">
      <el-header class="header" style="background-color: white">
        <el-input
          placeholder="请输入内容"
          prefix-icon="el-icon-search"
          v-model="input21" style="margin-top: 10px">
        </el-input>
      </el-header>


      <dev v-for="blog in blogList">
        <BlogCell v-bind:content="blog"></BlogCell>
      </dev>

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
          }
        ]
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
.myinfo {
  position: relative;
  top: 50%;
  transform: translateY(-30%);
}
.main {
  background-color: white;
  height: 100vh;
  margin: 0;
  padding: 0;
}

</style>
