<template>
  <div class="navbar navbar-expand-lg sticky-top py-md-2 border-bottom">
    <div class="container">
      <div class="left d-flex">
        <button class="navbar-toggler color-900" type="button" data-bs-toggle="collapse" data-bs-target="#navbar-collapse"
          aria-controls="navbar-collapse" aria-expanded="false" aria-label="Toggle navigation">
          <i class="fa fa-bars"></i>
        </button>
        <router-link class="navbar-brand" to="/">
          <img style="width: 64px;" src="@/assets/logo.png">
        </router-link>
      </div>
      
      <div class="collapse navbar-collapse justify-content-between" id="navbar-collapse">
        <ul class="navbar-nav">
          <li class="ms-lg-2 ms-md-1 nav-item"><router-link class="nav-link" to="/house/info">실거래가</router-link></li>
          <li class="ms-lg-2 ms-md-1 nav-item"><router-link class="nav-link" to="/house/board">매물</router-link></li>
          <li class="ms-lg-2 ms-md-1 nav-item"><router-link class="nav-link" to="/notice">공지사항</router-link></li>
        </ul>
      </div>
      <div class="d-flex align-items-center">
        <div class="d-flex profile-dropdown">
          <div class="dropdown" v-show="isAuth">
            <a href="javascript:void(0);" role="button" data-bs-toggle="dropdown" >
              <img v-if="profileImgUrl" :src="profileImgUrl" alt="프로필 이미지" class="avatar rounded-circle">
              <img v-else :src="require(`@/assets/logo.png`)" alt="기본 프로필 이미지" class="avatar rounded-circle">
            </a>
            &nbsp;{{ name }}님 환영합니다.
            <ul class="dropdown-menu dropdown-menu-end shadow border-0 m-0 p-3">
              <li><router-link class="dropdown-item py-2 rounded" to="/myaccount/profile"><i class="fa fa-user me-3"></i>마이 페이지</router-link></li>
              <li><a class="dropdown-item py-2 rounded" @click="onClickLogout"><i class="fa fa-info-circle me-3"></i>로그아웃</a></li>
            </ul>
          </div>
          <div class="isNotAuth" v-show="!isAuth">
            <ul class="navbar-nav">
              <li class="ms-lg-2 ms-md-1 nav-item"><router-link class="nav-link" to="/user/login">로그인</router-link></li>
              <li class="ms-lg-2 ms-md-1 nav-item"><router-link class="nav-link" to="/user/join">회원가입</router-link></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>
export default {
  name: "TheHeaderNavbar",
  data() {
    return {
      
    };
  },
  computed: {
  },
}
</script>

<style scoped>
#logo {
  width: 120px;
}
.link {
  text-decoration: none;
}
</style>