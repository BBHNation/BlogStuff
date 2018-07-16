<template>
  <div class="BlogCell">
    <div class="leftContent">
      <h1>Unity AR 体验记</h1>
      <p>在 iOS 11 发布时，作为其重磅功能之一的 ARKit 就引起了我强烈的兴趣。在最初的 beta 版本放出后，我就第一时间下载更新，并开始研究它的应用方法。</p>
      <p>1个月前发布</p>
    </div>

    <div class="rightImg">
      <img style="height:150px; margin-top: 25px; margin-bottom:auto" src="../assets/Cell.png">
    </div>
  </div>

</template>

<script>
    export default {
        name: "BlogCell"
    }
</script>

<style scoped>
  .leftContent, .rightImg {
    background-color: white;
  }
  .BlogCell {
    height: 200px;
    background-color: white;
  }
  h1, p {
    text-align: left;
    margin-left: 20px;
  }

  .leftContent {
    float: left;
    width: 70%;
  }
  .rightImg {
    float: left;
    width: 20%;
  }

</style>
