package net.member.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.commons.action.Action;
import net.commons.action.ActionForward;

public class MemberLogoutAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		ActionForward forward=new ActionForward();
		
		System.out.println("로그아웃 성공");
        session.invalidate(); //세션 초기화
        forward.setRedirect(true);
        forward.setPath("./Main.me");
        
		return forward;
	}

}
