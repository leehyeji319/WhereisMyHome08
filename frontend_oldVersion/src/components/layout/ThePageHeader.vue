<template>
  <!-- block Header -->
  <div class="block-header py-4 py-lg-5">
    <div class="container">
      <div class="row mb-4">
        <div class="col">
          <ul class="breadcrumb bg-transparent mb-0">
            <li class="breadcrumb-item"><router-link to="/" class="text-decoration-none">Home</router-link></li>
            <li class="breadcrumb-item active">{{ name }}</li>
          </ul>
        </div>
      </div>
      <!-- .row end-->
      <div class="row">
        <div class="col-xl-8 col-lg-7 col-md-12">
          <div class="welcome-text mb-4">
            <h1 class="fs-3 mb-1">{{ name }}</h1>
            <!-- <p class="fs-6 text-muted">{{ desc }}</p> -->
          </div>
        </div>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  name: 'ThePageHeader',
  props: ['name']
}
</script>

<style>
</style>