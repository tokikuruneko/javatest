public class Main{
	public static void main(String[] args){
		//���e�����F�\�[�X�R�[�h�ɒ��ڏ������񂾒l�܂��͂��̕\�L
		//
		//�������e����
		System.out.println(255);	//10�i��
		System.out.println(0b11111111);	//2�i��
		System.out.println(0377);	//8�i��
		System.out.println(0xff);	//16�i��

		//���������_���e����
		System.out.println(12.33);	//���������_
		System.out.println(3e4);	//�w�� (3.0 * 10^4)

		//�������e�����@Unicode
		System.out.println('A');	//1����
		System.out.println('\u3012');	//Unicode
		System.out.println("hello");	//������

		//�_���l���e����
		System.out.println(true);	//�_���l

		//�Q�i�A���_�[�X�R�A�j�����鐔�l���e����
		//�����̑傫�Ȑ��l���e�����̉ǐ������߂���́B������J���}
		//���p���̃��[��
		//�E���e�����̐擪�A�����ɂ͎g�p�ł��Ȃ�
		//�E���������_���e�����ɂ��鏬���_�̑O��ɂ͎g�p�ł��Ȃ�
		//�Efloat�l��\������F�i��������f�j����сAlong�l��\������L(��������l)�̑O�ɂ͎g�p�ł��Ȃ�
		//�E�P�U�i���Ŏg�p����0x�ƂQ�i���Ŏg�p����0b�̓r���y�ёO��ɂ͎g�p�ł��Ȃ�
		
		//float x1 = 3_.1415F;		//NG
		//float x2 = 3._1415F;		//NG
		//long x3 = 999_99_9999_L:	//NG
		//int x4 = _52;			//NG
		int x5 = 5_2;			//OK
		//int x6 = 52_;			//NG
		int x7 = 5_____2;		//OK
		//int x8 = 0_x52;		//NG
		//int x9 = 0x_52;		//NG
		int x10 = 0x5_2;		//OK
		int x11 = 0_52;			//OK
	}
}

