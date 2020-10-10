package cn.tedu.product.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jt.common.pojo.Product;
import com.jt.common.vo.EasyUIResult;

import cn.tedu.product.mapper.ProductMapper;
@Service
public class ProductService {
	@Autowired
	private ProductMapper productMapper;
	public EasyUIResult productPageQuery(Integer page, Integer rows) {
		//准备封装数据的EasyUIResult
		EasyUIResult result = new EasyUIResult();
		//利用mapper查询总条数
		Integer total = productMapper.queryTotal();
		//确定起始位置和查的条数
		Integer start = (page-1)*rows;
		//利用mapper根据起始位置和每页条数查询商品list
		List<Product> list = productMapper.queryByPage(start,rows);
		//将数据封装到EasyUIResult并返回
		result.setTotal(total);
		result.setRows(list);
		return result;
	}
}
