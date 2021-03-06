package com.ee.web;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

@Controller
@RequestMapping(value = "api")
public class MockController {

	private static Logger logger = LoggerFactory.getLogger(MockController.class);
	
	@RequestMapping(value = "main/list")
    @ResponseBody
	public Object mainList(){
		logger.info("receive request mainList");

		Map<String, List<Map<String,Object>>> result = Maps.newHashMap();
		List<Map<String, Object>> categoryList = Lists.newArrayList();
		
		Map<String, Object> category = Maps.newHashMap();
		category.put("name", "分类名");
		category.put("moreUrl", "更多url");
		
		List<Map<String, Object>> productList = Lists.newArrayList();
		Map<String, Object> product = Maps.newHashMap();
		product.put("pic", "商品图片");
		product.put("url", "./resources/pics/Friso2main.jpg");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "200");
		List<Map<String, String>> tags = Lists.newArrayList();
		Map<String, String>tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "商品图片");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "200");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "商品图片");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "200");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		category.put("productList", productList);
		categoryList.add(category);
		
		category = Maps.newHashMap();
		category.put("name", "分类名");
		category.put("moreUrl", "更多url");
		
		productList = Lists.newArrayList();
		product = Maps.newHashMap();
		product.put("pic", "商品图片");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "200");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "商品图片");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "200");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "商品图片");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "200");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		category.put("productList", productList);
		
		categoryList.add(category);
		
		category = Maps.newHashMap();
		category.put("name", "分类名");
		category.put("moreUrl", "更多url");
		
		productList = Lists.newArrayList();
		product = Maps.newHashMap();
		product.put("pic", "商品图片");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "200");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "商品图片");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "200");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "商品图片");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "200");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		category.put("productList", productList);
		categoryList.add(category);
		
		result.put("categoryList", categoryList);
		return result;
	}
	
	@RequestMapping(value = "category/type")
    @ResponseBody
	public Object categoryType(){
		logger.info("receive request categoryType");
		Map<String, List<Map<String,Object>>> result = Maps.newHashMap();
		
		List<Map<String, Object>> subCateList = Lists.newArrayList();
		
		Map<String, Object> subCate = Maps.newHashMap();
		subCate.put("name", "品牌");
		
		List<Map<String, Object>> typeList = Lists.newArrayList();
		Map<String, Object> type = Maps.newHashMap();
		type.put("name", "美素佳儿");
		type.put("type", "010101");
		type.put("selected", true);
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "惠氏");
		type.put("type", "010102");
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "雀巢");
		type.put("type", "010103");
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "诺优能");
		type.put("type", "010104");
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "爱他美");
		type.put("type", "010105");
		typeList.add(type);
		
		subCate.put("typeList", typeList);
		subCateList.add(subCate);
		
		subCate = Maps.newHashMap();
		subCate.put("name", "段位");
		typeList = Lists.newArrayList();
		type = Maps.newHashMap();
		type.put("name", "1段");
		type.put("type", "010201");
		type.put("selected", true);
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "2段");
		type.put("type", "010202");
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "3段");
		type.put("type", "010203");
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "4段");
		type.put("type", "010204");
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "5段");
		type.put("type", "010205");
		typeList.add(type);
		
		subCate.put("typeList", typeList);
		subCateList.add(subCate);
		result.put("subCateList", subCateList);
		
		return result;
	}
	
	@RequestMapping(value = "category/list")
    @ResponseBody
	public Object categoryList(String cateFid, Integer type, Integer start, Integer count){
		logger.info("receive request categoryList");
		Map<String, List<Map<String,Object>>> result = Maps.newHashMap();
		
		List<Map<String, Object>> productList = Lists.newArrayList();
		Map<String, Object> product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		List<Map<String, String>> tags = Lists.newArrayList();
		Map<String, String>tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		product = Maps.newHashMap();
		product.put("pic", "./resources/pics/Friso2main.jpg");
		product.put("url", "url");
		product.put("title", "美素金装1段标题");
		product.put("lowPrice", "210");
		tags = Lists.newArrayList();
		tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tags.add(tag);
		product.put("tags", tags);
		productList.add(product);
		
		result.put("productList", productList);
		
		return result;
	}
	
	@RequestMapping(value = "product/specList")
    @ResponseBody
	public Object specList(){
		logger.info("receive request specList");
		Map<String, List<Map<String,Object>>> result = Maps.newHashMap();
		
		List<Map<String, Object>> specList = Lists.newArrayList();

		Map<String, Object> spec = Maps.newHashMap();
		
		spec.put("name", "容量");
		
		List<Map<String, Object>> typeList = Lists.newArrayList();
		spec.put("typeList", typeList);
		Map<String, Object> type = Maps.newHashMap();
		type.put("name", "400g盒装");
		type.put("url", "url");
		type.put("selected", true);
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "1200g盒装");
		type.put("url", "url");
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "400g罐装");
		type.put("url", "url");
		typeList.add(type);
		
		type = Maps.newHashMap();
		type.put("name", "900g罐装");
		type.put("url", "url");
		typeList.add(type);
		
		specList.add(spec);
		result.put("specList", specList);
		
		return result;
	}
	
	@RequestMapping(value = "product/detail")
    @ResponseBody
	public Object productDetail(String productFid){
		logger.info("receive request productFid");
		Map<String, Object> product = Maps.newHashMap();
		product.put("title", "美素金装1段标题");
		
		List<Map<String, String>> rotatePicList = Lists.newArrayList();
		Map<String, String> rotatePic = Maps.newHashMap();
		rotatePic.put("url", "./resources/pics/Friso2p1.jpg");
		rotatePicList.add(rotatePic);
		rotatePic = Maps.newHashMap();
		rotatePic.put("url", "./resources/pics/Friso2p2.jpg");
		rotatePicList.add(rotatePic);
		rotatePic = Maps.newHashMap();
		rotatePic.put("url", "./resources/pics/Friso2p3.jpg");
		rotatePicList.add(rotatePic);
		product.put("rotatePicList", rotatePicList);
		
		List<Map<String, String>> tags = Lists.newArrayList();
		Map<String, String>tag = Maps.newHashMap();
		tag.put("name", "原装进口");
		tag.put("detail", "直接在国外生产包装");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "产地最优");
		tag.put("detail", "荷兰是世界上最好的牧场");
		tags.add(tag);
		tag = Maps.newHashMap();
		tag.put("name", "不上火");
		tag.put("detail", "独特小分子技术");
		tags.add(tag);
		product.put("tags", tags);
		
		List<Map<String, Object>> sourceList = Lists.newArrayList();
		Map<String, Object> source = Maps.newHashMap();
		source.put("pic", "./resources/pics/jd-logo.png");
		source.put("price", "200");
		source.put("url", "http://www.jd.com");
		List<Map<String, String>> discountList = Lists.newArrayList();
		Map<String, String> discount = Maps.newHashMap();
		discount.put("detail", "买一送一");
		discountList.add(discount);
		discount = Maps.newHashMap();
		discount.put("detail", "买一送二");
		discountList.add(discount);
		source.put("discountList", discountList);
		sourceList.add(source);
		
		source = Maps.newHashMap();
		source.put("pic", "./resources/pics/jd-logo.png");
		source.put("price", "210");
		source.put("url", "http://www.jd.com");
		discountList = Lists.newArrayList();
		discount = Maps.newHashMap();
		discount.put("detail", "买一送一");
		discountList.add(discount);
		discount = Maps.newHashMap();
		discount.put("detail", "买一送二");
		discountList.add(discount);
		source.put("discountList", discountList);
		sourceList.add(source);
		
		source = Maps.newHashMap();
		source.put("pic", "./resources/pics/jd-logo.png");
		source.put("price", "220");
		source.put("url", "http://www.jd.com");
		discountList = Lists.newArrayList();
		discount = Maps.newHashMap();
		discount.put("detail", "买一送一");
		discountList.add(discount);
		discount = Maps.newHashMap();
		discount.put("detail", "买一送二");
		discountList.add(discount);
		source.put("discountList", discountList);
		sourceList.add(source);
		
		source = Maps.newHashMap();
		source.put("pic", "./resources/pics/jd-logo.png");
		source.put("price", "210");
		source.put("url", "http://www.jd.com");
		discountList = Lists.newArrayList();
		discount = Maps.newHashMap();
		discount.put("detail", "买一送一");
		discountList.add(discount);
		discount = Maps.newHashMap();
		discount.put("detail", "买一送二");
		discountList.add(discount);
		source.put("discountList", discountList);
		sourceList.add(source);
		
		source = Maps.newHashMap();
		source.put("pic", "./resources/pics/jd-logo.png");
		source.put("price", "210");
		source.put("url", "http://www.jd.com");
		discountList = Lists.newArrayList();
		discount = Maps.newHashMap();
		discount.put("detail", "买一送一");
		discountList.add(discount);
		discount = Maps.newHashMap();
		discount.put("detail", "买一送二");
		discountList.add(discount);
		source.put("discountList", discountList);
		sourceList.add(source);
		
		source = Maps.newHashMap();
		source.put("pic", "./resources/pics/jd-logo.png");
		source.put("price", "210");
		source.put("url", "http://www.jd.com");
		discountList = Lists.newArrayList();
		discount = Maps.newHashMap();
		discount.put("detail", "买一送一");
		discountList.add(discount);
		discount = Maps.newHashMap();
		discount.put("detail", "买一送二");
		discountList.add(discount);
		source.put("discountList", discountList);
		sourceList.add(source);
		
		source = Maps.newHashMap();
		source.put("pic", "./resources/pics/jd-logo.png");
		source.put("price", "210");
		source.put("url", "http://www.jd.com");
		discountList = Lists.newArrayList();
		discount = Maps.newHashMap();
		discount.put("detail", "买一送一");
		discountList.add(discount);
		discount = Maps.newHashMap();
		discount.put("detail", "买一送二");
		discountList.add(discount);
		source.put("discountList", discountList);
		sourceList.add(source);
		
		product.put("sourceList", sourceList);
		
		return product;
	}
}
