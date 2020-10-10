package cn.tedu.product.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.jt.common.vo.EasyUIResult;
import cn.tedu.product.service.ProductService;
@RestController
public class ProductController {
	@Autowired
	private ProductService productService;
	@RequestMapping("/product/manage/pageManage")
	public EasyUIResult productPageQuery(Integer page,Integer rows){
		EasyUIResult result = productService.productPageQuery(page,rows);
		return result;
	}
}
