//�⺻������ �ƹ��� �ɼ��� �߰����� ���� ������ ����, �Ѱ����� �⺻����+�ɼǺ� �߰��ݾ��� ����� �ݾ�
//���Ŀ� �ɼ��� �������� �ְ� ���� ���� �ִ�.
//get �� �����͸� return  set �� �����͸� ������ �����ϴ� ����
//��� ������ private
//�⺻������ ������
//public int getPrice();
//�⺻������ �޾Ƽ� ������
//public void setPrice(int price);
//������ �̸��� ������
//public String getName();
//������ �̸��� ������
//public void setName(String name);
//toString Override �ؼ� �ش� ���Ŀ� ���� ����� �Ѵ�
//public String toString();
//�Ѱ����� �����´�
//public int getTotalPrice();
// �Ѱ����� ���� �Ұ���

package food;

public interface Food {
	
	public int getPrice();
	public void setPrice(int price);
	public String getName();
	public void setName(String name);
	public String toString();
	public int getTotalPrice();


}
