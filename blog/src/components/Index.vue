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
          v-model="input21" style="margin-top: 10px">
        </el-input>
      </el-header>
      <BlogCell/>
      <BlogCell/>
      <BlogCell/>
      <BlogCell/>
      <BlogCell/>
      <BlogCell/>
      <el-footer style="background-color: white">
        <el-button round style="margin-top: 10px;">上一页</el-button>
        <el-button round style="margin-top: 10px;">下一页</el-button>
      </el-footer>
    </el-main>
  </el-container>
</template>

<script>
  import MyInfo from "./Myinfo";
  import BlogCell from "./BlogCell";
  export default {
    components: {BlogCell, MyInfo}
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
  transform: translateY(-30%);
}
.main {
  background-color: #EBEBEB;
  height: 100vh;
  margin: 0;
  padding: 0;
}

</style>
