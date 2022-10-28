<template>

  <div class="container">
    <div class="row">
    <div class="col-12 text-center">
      <h3 class="pt-3">Our Product</h3>
      <router-link id="add-product" :to="{name : 'AddProduct'}" v-show="$route.name=='AdminProduct'">
        <button class="btn">Add a new Product</button>
      </router-link>
    </div>
    </div>
    <div class="row">
      <div v-for="product of products" :key="product.id" class="col-md-6 col-xl-4 col-12 pt-3  justify-content-around d-flex">
        <ProductBox :product="product">
        </ProductBox>
      </div>
    </div>
  </div>
</template>

<script>
import ProductBox from '../../components/Product/ProductBox';
var axios =  require('axios');
export default {
  name: 'Product',
  components: {ProductBox},
  data() {
    return {
      baseURL: "http://localhost:8080/",
      product: null,
    }
  },

  methods: {
    async getProducts() {
      //fetch categories
      await axios.get(this.baseURL + "product/")
          .then(res => this.products = res.data)
          .catch(err => console.log(err))
    }
  },
  mounted(){
    this.getProducts();
  }
}
</script>

<style scoped>

.card{
  width : 20rem;
  height : 24rem;
}

h4 {
  font-family: 'Roboto', sans-serif;
  color: #484848;
  font-weight: 700;
}

#add-product {
  float: right;
  font-weight: 500;
}
</style>
