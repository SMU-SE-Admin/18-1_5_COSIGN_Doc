package todoex;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
 
public class SubjectEnroll
{
	// 필요한 필드 선언
	//작업 진행중
	JFrame jFrame = new JFrame("과목 등록 화면");
	JDialog jDialog = new JDialog(jFrame, "JDialog 타이틀");
	JButton jButton = new JButton("Click");

	// GUI 구현 생성자
	public SubjectEnroll()
	{
		// 다이얼로그에 버튼 추가
		jDialog.add(jButton, "South");

		// 기본 프레임 크기와 보기 설정
		jFrame.setSize(500, 800);
		jFrame.setVisible(true);
		//X버튼 누르면 프로그램 종료
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// 다이얼로그의 크기와 보기 설정
		jDialog.setSize(100, 100);
		jDialog.setVisible(true);
		//★X버튼 누르면 다이얼로그만 종료
		jDialog.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

	}
	
	

	public static void main(String[] args)
	{
		//실행
		new SubjectEnroll();
	}

}
