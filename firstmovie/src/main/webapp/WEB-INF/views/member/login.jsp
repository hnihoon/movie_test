<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="/css/login.css" />

 	<form method="post" action="login.do" onsubmit="return member()">
	 <div class="logwrap">
 	<a href="/main"><img alt="" src="/images/header/logo.png"></a>
 	<div class="loginput">
 		<div class="userid">
	      <input id="member_id" type="test" name="member_id" value="">
	    </div>
	    <div class="userpw">
	      <input id="member_pw" type="password" name="member_pw">
	    </div>
 	</div>
 	<div>
 		<span>
	    <input type="checkbox" id="idcheckbox" name="idcheckbox">
	    <label class="check_label" for="idcheckbox" th:onclick="toggleCheckbox()" onselectstart="return false;">아이디저장</label>
	    </span>
	    <span>
		    <a href="/member/member.do">회원가입 | </a>
		    <a href="#">아이디찾기 | </a>
		    <a href="#">비밀번호찾기</a>
	    </span>
	</div>
	<div class="logbox">
		<button class="fmos" type="submit">5분1초</button>
		<button class="naverbt">네이버</button>
		<button class="googlebt">
			<span style="color: blue;">G</span>
			<span style="color: red;">o</span>
			<span style="color: rgb(255, 210, 0);">o</span>
			<span style="color: blue;">g</span>
			<span style="color: green;">l</span>
			<span style="color: red;">e</span>
		</button>
		<button class="kakaobt">kakao</button>
	</div>
 </div>
 </form>
 
<!-- 쿠키 가져오기 + 아이디저장 기능 관련 시작 -->
<script>
	function getCookie(cookieName) {
	    const name = cookieName + "=";
	    const decodedCookie = decodeURIComponent(document.cookie);
	    const cookieArray = decodedCookie.split(';');
	
	    for (let i = 0; i < cookieArray.length; i++) {
	        let cookie = cookieArray[i].trim();
	        if (cookie.indexOf(name) === 0) {
	            return cookie.substring(name.length, cookie.length);
	        }
	    }
	
	    return "";
	}
	
	// 사용 예시
	const cIDCookie = getCookie("c_id");
	const idCheckcookie = getCookie("idcheck");
	const idcheckbox = document.getElementById("idcheckbox");
	document.getElementById("member_id").value = cIDCookie;

	if (idCheckcookie === "1") {
		idcheckbox.checked = true;
	}
<!-- 쿠키 가져오기 + 아이디저장 기능 관련 끝 -->	
</script>

<!-- ID저장 checkbox 체크시1 체크안할시2가 출력되도록 해주는 기능 시작 -->
 	 <script>
		 var checkbox = document.getElementById("idcheckbox"); 
		
		 function CheckboxChange(checkbox) {
			    if (checkbox.checked) {
			      checkbox.value = "1";
			      console.log(checkbox.value);
			    } else {
			      checkbox.value = "2";
			      console.log(checkbox.value);
			    }
			  }

			  // 각 체크박스에 이벤트 리스너를 등록합니다.
			  checkbox.addEventListener("change", function() {
			  CheckboxChange(checkbox);
			  });
	</script>
 <!-- ID저장 checkbox 체크시 2 체크 안할시 1이 출력되도록 해주는 기능 시작 -->
 
<%@ include file="../footer.jsp" %>