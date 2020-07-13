package customer;

import java.util.List;
import java.util.Scanner;

public class EmpManager {

	public static void main(String[] args) {
		IEmpDAO dao = new EmpDAO();
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		boolean run = true;

		try {
			while(run) {
				System.out.println("-------------------------------------");
				System.out.println("1.등록 | 2.수정 | 3.삭제 | 4.리스트 | 5.종료");
				System.out.println("-------------------------------------");
				System.out.print("메뉴 입력 >> ");
				menu = sc.nextInt();

				switch(menu) {
				case 1:
					EmpVO emp = new EmpVO();
					emp.setEmployeeId(401);
					emp.setFirstName("홍길동");
					emp.setLastName("Heo");
					emp.setEmail("asdfgh");
					emp.setPhoneNumber("010-3402-7902");
					emp.setHireDate(new java.sql.Date(new java.util.Date().getTime()));
					emp.setJobId("IT_PROG");
					emp.setSalary(9000);
					emp.setCommissionPct(0.8);
					emp.setManagerId(100);
					emp.setDepartmentId(60);
					dao.insertEmp(emp);
					System.out.println("==입력 성공==");
					break;
				case 2:
					int re = 0;
					System.out.print("수정) 번호 입력 >> ");
					re = sc.nextInt();
					if(re == emp.getEmployeeId()) {
						dao.updateEmp(emp);
					}
					System.out.println("==수정 성공==");
					break;
				case 3:
					int del = 0;
					System.out.print("삭제) 번호 입력 >> ");
					del = sc.nextInt();
					dao.deleteEmp(del);
					System.out.println("==삭제 성공==");
					break;
						/*EmpVO emp1 = dao.selectEmp(103);
						System.out.println(emp1);
						List<EmpVO> empList1 = dao.selectEmpByDeptno(60);
						List<EmpVO> empList = dao.selectAllEmp();
						for(EmpVO vo : empList) {
							System.out.println(vo);
						}*/
					
				}
			}
		}catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}
}