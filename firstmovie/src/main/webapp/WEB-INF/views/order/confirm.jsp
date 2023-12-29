<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../header.jsp" %>
<link rel="stylesheet" href="/css/store.css">
<link rel="stylesheet" href="/css/cart.css">
<link rel="stylesheet" href="/css/order.css">
<script>
	function orderCheck(){
		//유효성 검사(받는사람, 받는주소, 배송메시지 등)
		if(confirm("결제할까요?")){
			return true;
		}else{
			return false;
		}//if end
	}//orderCheck() end
</script>

<!-- contents 시작 -->
<div id="contents">
  	<div id="divAction"><!-- header와 body사이에 있는 빨간 라인 -->
  	<div class="tit-evt">
  		<h3>장바구니 결제하기</h3>
  	</div>
  	
  	<!-- category_wrap 시작 -->
  	<div class="category_wrap">
  		<div class="category_contents_wrap">
  			<ul class="category_content">
  				<li id="cm1" name="categorymenu">
   					<a href="/product/category.do?product_category_id=1">패키지</a>
   				</li>
   				<li id="cm2" name="categorymenu">
   					<a href="/product/category.do?product_category_id=2">영화관람권</a>
   				</li>
   				<li id="cm3" name="categorymenu">
   					<a href="/product/category.do?product_category_id=3">콤보</a>
   				</li>
   				<li id="cm4" name="categorymenu">
   					<a href="#">팝콘</a>
   				</li>
   				<li id="cm5" name="categorymenu">
   					<a href="#">음료</a>
   				</li>
   				<li id="cm6" name="categorymenu">
   					<a href="#">스낵</a>
   				</li>
   				<li id="cm7" name="categorymenu">
   					<a href="#">플레이존</a>
   				</li>
  			</ul>
  			<ul class="cart_content">
  				<li>
  					<a href="/cart/list.do">장바구니<span id="cartviewcnt">0</span></a>
  				</li>
  			</ul>
  		</div>
  	</div>
  	<!-- category_wrap 끝 -->
  	
	<!-- cart_wrap 시작 -->
	<div class="cart_step_wrap">
		<ul class="cart_step step_unit3">
			<li class="step1"><span>STEP 01</span><strong>장바구니</strong></li>
			<li class="step2 active"><span>STEP 02</span><strong>결제하기</strong></li>
			<li class="step3"><span>STEP 03</span><strong>결제완료</strong></li>
		</ul>
	</div>
	<form method="get" action="" name="orderfrm" id="orderfrm" onsubmit="return orderCheck()">
	<table class="com_cart_list_wrap">
		<input type="hidden" name="cartno" value="">
		    <thead>
		      <tr class="thead_wrap">
		        <th><strong>상품명</strong></th>
		        <th><strong>판매금액</strong></th>
		        <th><strong>수량</strong></th>
		        <th><strong>구매금액</strong></th>
		        <th><strong>선택</strong></th>
		      </tr>
		    </thead>
		    <tbody>
		      <tr class="tbody_wrap">
		        <td>라지콤보</td>
				<td>15,000원</td>
				<td>1</td>
				<td>15,000원</td>
				<td>
					<input type="button" value="삭제" onclick="">
				</td>
		      </tr>
		    </tbody>
	   </table>
	<span id="notimsg">장바구니에 담긴 상품은 최대 30일까지 보관됩니다.</span>
	<table class="com_cart_total_price_wrap" summary="총 상품 금액, 할인금액을 합산한 총 결제예정 금액 표기">
		<colgroup>
			<col style="width: 30%">
			<col style="width: 36%">
			<col style="width: 34%">
		</colgroup>
		<thead>
	      <tr class="thead_wrap">
	        <th>총 상품 금액</th>
	        <th>할인금액</th>
	        <th>총 결제 예정금액</th>
	      </tr>
	    </thead>
	    <tbody>
	      <tr class="tbody_wrap">
	        <td>15,0000원</td>
			<td>0원</td>
			<td>15,000원</td>
	      </tr>
	    </tbody>
	</table>
	<div class="com_box_design_wrap">
		<strong class="com_box_design_title">주문자 정보 확인</strong>
		<ul class="com_box_design">
			<li>
				<label for="user_info_name">이름</label>
				<input type="text" id="user_info_name" placeholder="이름" style="width: 128px" value="">
				<label for="user_info_phonenum">휴대전화 번호</label>
				<input type="tel" id="user_info_phonenum" placeholder="휴대전화 번호" style="width: 228px" value="">
			</li>
		</ul>
		<p class="com_box_design_olist">※ 입력된 휴대전화 번호가 맞는지 꼭 확인하세요.</p>
			<strong class="com_box_design_title">결제 수단</strong>
			<ul class="radioCheck">
			<li id="liCard">
			<div class="cardlabel">
			    <label for="creditCardType">
			   		<input type="radio" name="radio" class="custom_card" id="payment_card">신용카드
			    </label>
			    <select id="creditCardType" name="creditCardType">
			      <option value="suntaek">선택</option>
			      <option value="sinhan">신한카드</option>
			      <option value="handai">현대카드</option>
			      <option value="samsung">삼성카드</option>
			    </select>
			    <label>
			      <input type="radio" name="radio" value="kakaopay">카카오페이
			    </label>
		    </div>
		    </li>
		    </ul>
	</div>
		<input type="submit" value="결제하기" class="cartButton">
	</form>
	<!-- cart_wrap 끝 -->
	</div>
</div>
<!-- contents 끝 -->
<%@ include file="../footer.jsp" %>