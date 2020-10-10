package cn.tedu.product.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jt.common.pojo.Product;
public interface ProductMapper {
	Integer queryTotal();
	//如果参数大于两个，映射文件无法直接通过变量名拿到此参数
	//可以通过@Param将指定的变量名传给映射文件
	List<Product> queryByPage(@Param("start")Integer start, @Param("rows")Integer rows);
}
