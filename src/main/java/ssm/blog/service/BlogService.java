package ssm.blog.service;

import java.util.List;
import java.util.Map;

import ssm.blog.entity.Blog;
import ssm.blog.entity.PageBean;

/**
 * @Description ����Service�ӿ�
 * @author xp
 *
 */
public interface BlogService {


	// ��ҳ��ѯ����
	public PageBean<Blog> listBlog(String title, PageBean<Blog> pageBean);


	// ���ݲ������͵�id��ѯ�������µĲ�������
	public Integer getBlogByTypeId(Integer typeId);
}
