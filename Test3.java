package javaprogram1;
import java.util.Scanner;				//����Scanner��
public class Test3{
	public static void main(String args[]){
		System.out.println("����������ͺţ�1Ϊ������ԣ�2Ϊ��Ϊ���ԣ�3ƻ������");
		logo logo1 = new logo();		//������������ͺ�.�����ͬ�����ͺŵ��ڴ��С�������ٶ�
		if(logo1.computerType == 1) {
			logo1.allamount = 520;
			logo1.allspeed = 2560;
		}else if(logo1.computerType == 2){
			logo1.allamount = 650;
			logo1.allspeed = 3567;
		}else if(logo1.computerType == 3) {
			logo1.allamount = 750;
			logo1.allspeed = 5621;
		}else {
			System.out.println("������󣬽�����");
		}
		CPU cpu1 = new CPU();
		HardDisk disk1 = new HardDisk();
		cpu1.setSpeed(logo1.allspeed);			//����CPU�ഴ����setSpeed������������cpu1��speed��ֵ
		disk1.setAmount(logo1.allamount);			//����HarDisk�ഴ����setAmount������������disk1��amount��ֵ
		PC pc =new PC ();
		pc.setCPU(cpu1);				//����PC�ഴ����setCPU����
		pc.setHardDisk(disk1);			//����PC�ഴ����setHarDisk����
		pc.show();				//����PC������show�����������CPU�������ٶ�ֵ��PC������ֵ
		Scanner beginTime = new Scanner(System.in);
		System.out.println("��������Կ�ʼ������ʱ�乤��ʱ�䣨h����");
		int beginTime1=beginTime.nextInt();							//������Կ�ʼ���е�ʱ��
		System.out.println("������������ڵ�ʱ�䣨h����");						//����Ŀǰʱ��
		Scanner overTime = new Scanner(System.in);
		int overTime1 = overTime.nextInt();
		CPU cpu = new CPU((overTime1-beginTime1));		//���ù��췽�������CPU�Ĺ���ʱ�� 
		System.out.println("������������ʣ���ڴ�");
		Scanner reader1 =new Scanner(System.in);
		HardDisk disk = new HardDisk(reader1.nextDouble());				//���ù��췽�����������ʣ����ڴ�
			
			
				}
}