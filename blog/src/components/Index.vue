<template>
  <el-container class="container">
    <el-aside class="aside">
        <div class="myinfo">
          <my-info></my-info>
        </div>
    </el-aside>
    <el-main class="main">
      <el-header class="header">
        header
      </el-header>
      Main
      <BlogCell></BlogCell>
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
.myinfo {
  position: relative;
  top: 50%;
  transform: translateY(-50%);
}
.main {
  background-color: #EBEBEB;
  height: 100vh;
  margin: 0;
  padding: 0;
}
.header {
  background-color: #666666;
}

</style>
