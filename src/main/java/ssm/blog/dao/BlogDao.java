package ssm.blog.dao;

import java.util.List;
import java.util.Map;

import ssm.blog.entity.Blog;

/**
 * @Description ����Dao�ӿ�
 * @author xp
 *
 */
public interface BlogDao {


	// ��ҳ��ѯ����
	public List<Blog> listBlog(Map<String, Object> map);

	// ��ȡ�ܼ�¼��
	public Long getTotal(String title);

	// ���ݲ������͵�id��ѯ�������µĲ�������
	public Integer getBlogByTypeId(Integer typeId);
}
