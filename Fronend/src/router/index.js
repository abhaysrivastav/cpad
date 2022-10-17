import { createRouter, createWebHistory } from 'vue-router'
import Home from '../views/Home.vue'
import AddCategory from "../views/Category/AddCategory";
import Category from "../views/Category";
import AddProduct from "../views/Product/AddProduct";
import Product from "../views/Product/Product";
import ShowDetails from "../views/Product/ShowDetails";
const routes = [
  {
    path: "/",
    name: "Home",
    component: Home,
  },

  {
    path: "/admin/category/add",
    name: "AddCategory",
    component: AddCategory,
  },

  {
    path: "/admin/category",
    name: "AdminCategory",
    component: Category,
  },

  {
    path: "/admin/product/add",
    name: "AddProduct",
    component: AddProduct,
  },

  {
    path: "/admin/product",
    name: "AdminProduct",
    component: Product,
  },

  {
    path : '/product/show/:id',
    name : 'ShowDetails',
    component: ShowDetails
  }
];

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router
