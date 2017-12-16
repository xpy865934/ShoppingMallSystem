<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="tp_page" content="3.0">
	<title>注册1号店</title>
	<link href="css/register_3.0.css?1561453" rel="stylesheet"
		type="text/css" />
	<script src="js/register_m.js"></script>
</head>
<body>
	<link rel="shortcut icon" href="images/yhd_favicon.ico" />

	<div class="regist_header clearfix">
		<div class="wrap">
			<a href="index.html" class="logo"><img src="images/loginlogo.jpg"
				height="55" alt="1号店" /></a>
			<div class="regist_header_right clearfix">
				<!--<a href="#" class="english_edition" id="edition" style="display:none">English</a>-->
				<div class="help_wrap">
					<a class="hd_menu" href="help.html"><s class="help_ico"></s>帮助中心</a>
					<div class="hd_menu_list">
						<ul>
							<li><a href="member_order.html">包裹跟踪</a></li>
							<li><a href="help.html">常见问题</a></li>
							<li><a href="http://my.yhd.com/return/returnApplyList.do">在线退换货</a></li>
							<li><a href="http://my.yhd.com/opinion/opinionList.do">在线投诉</a></li>
							<li><a
								href="http://www.yhd.com/deliveryinfo/deliveryInfo.do">配送范围</a></li>
						</ul>
					</div>
				</div>
				<span class="fr">您好，欢迎光临1号店！ <a href="login.html"
					class="blue_link">请登录</a></span>
			</div>
		</div>
	</div>
	<script type="text/javascript">
		var no3wUrl = "yhd.com";
		var currSiteId = 1;
		var URLPrefix = {
			"mymall" : "http://my.1mall.com",
			"passport_statics" : "https://passport.yhd.com/front-passport/passport",
			"yiwangauth" : "http://mall.yiwang.cn",
			"yaowang" : "http://www.111.com.cn",
			"tracker" : "tracker.yhd.com",
			"passport" : "https://passport.yhd.com",
			"my" : "http://my.yhd.com",
			"central" : "http://www.yhd.com",
			"validCodeShowUrl" : "https://captcha.yhd.com/public/validcode.do",
			"mall" : "http://www.1mall.com",
			"passportother" : "https://passport.1mall.com"
		};
		var yhdUrl = "http://www.yhd.com";
		var yhdPassportUrl = "https://passport.yhd.com";
		var ywPassportUrl = "https://passport.111.com.cn";
		var loli = window['loli'] || {};
		var valid_code_service_flag = "1";
	</script>
	<script type="text/javascript" src="js/jquery.cookie.js?1561453"></script>

	<input type="hidden" id="validateSig" />
	<input type="hidden" name="returnUrl" value="" id="returnUrl">
		<input id="p" type="hidden" value="" /> <input type="password"
		style="display: none">
			<div class="y_regist_wrap">
				<!--背景小图标 -->
				<div class="r_icon1"></div>
				<div class="r_icon2"></div>
				<div class="r_icon3"></div>
				<div class="r_icon4"></div>
				<div class="r_icon5"></div>
				<div class="y_regist_model">

					<h4 class="y_regist_tit">1号店注册</h4>
					<form id="register_form" action="${pageContext.request.contextPath}/register_regist.do" method="post">
						<div class="y_regist_form">
							<ul class="clearfix">
								<li>
									<div class="y_same_item">
										<input class="ysame_input" type="text" value="" id="phone"
											name="phone" /> <span class="y_same_label">手机号</span>

									</div>
									<div class="y_regist_tips y_regist_tips_black">
										<div class="y_regtip_rel">
											<i></i>
											<div class="y_tips_words">请填写正确的手机号码，以便 接收订单通知，找回密码等</div>
										</div>
									</div>

									<div class="y_regist_right"></div>
								</li>
								<li>
									<div class="y_same_item">
										<input class="ysame_input" type="text" value="" id="relname"
											name="realName" /> <span class="y_same_label">姓名</span>

									</div>
									<div class="y_regist_tips y_regist_tips_black">
										<div class="y_regtip_rel">
											<i></i>
											<div class="y_tips_words">请填写真实的姓名</div>
										</div>
									</div>

									<div class="y_regist_right"></div>
								</li>
								<!--<li class="ishort_li clearfix" style="display: none;" id="validCodeDiv">
                             <div class="fl y_same_item">
                                 <input class="ysame_input" type="text" value="" id="validCode" />
                                 <span class="y_same_label">验证码</span>
                             </div>
                             <a class="fl r_yzm_code" href="javascript:;" id="changevalidate">
                             	 <img id="validateImg"  width="124" height="50">
                                 <span class="yzm_change_mask"><em></em><i>换一张</i></span>                             
                             </a>
                             <div class="y_regist_tips y_regist_tips_red">
                               <div class="y_regtip_rel"> 
                                  <i></i>
                                  <div class="y_tips_words">
                                     	 请输入正确的验证码
                                  </div>
                               </div> 
                             </div>
                         </li>
                         
                         <li class="ishort_li clearfix " id="validPhoneCodeDiv">
                             <div class="fl y_same_item">
                                 <input class="ysame_input" type="text" value="" id="validPhoneCode"/>
                                 <span class="y_same_label">短信验证码</span>
                             </div>
                             
                            <a class="receive_code fl same_code_btn r_disable_code " href="javascript:;">获取验证码</a> 
                         
                             <div class="y_regist_tips y_regist_tips_red">
                               	<div class="y_regtip_rel"> 
                                  	<i></i>
                                  	<div class="y_tips_words">
                                      	如无法接受验证码，请重启手机并确认短信未被拦截！4G用户请关闭4G网络进行接收
                                  	</div>
                               	</div> 
                             </div>
                         </li>-->

								<li>
									<div class="y_same_item">
										<input name="userPassword" class="ysame_input y_set_password"
											type="password" oncopy="return false;" oncut="return false;"
											onpaste="return false;" autocomplete="off" id="password" />
										<span class="y_same_label">设置密码</span>
									</div>
									<div class="y_regist_tips y_regist_tips_red">
										<div class="y_regtip_rel">
											<i></i>
											<div class="y_tips_words">6-20个大小</div>
										</div>
									</div>

									<div class="y_regist_tips_keywords strength_l">
										<div class="y_regtip_rel">
											<i></i>
											<div class="y_tips_words y_tips_words_key">
												<em class="em_redA"></em> <em></em> <em></em> <b
													class="em_words">低</b>
											</div>
										</div>
									</div>

									<div class="y_regist_tips_keywords strength_m">
										<div class="y_regtip_rel">
											<i></i>
											<div class="y_tips_words y_tips_words_key">
												<em class="em_yellowA1"></em><em class="em_yellowA1"></em><em></em><b
													class="em_words">中</b>
											</div>
										</div>
									</div>

									<div class="y_regist_tips_keywords strength_h">
										<div class="y_regtip_rel">
											<i></i>
											<div class="y_tips_words y_tips_words_key">
												<em class="em_greenA1"></em><em class="em_greenA1"></em><em
													class="em_greenA1"></em><b class="em_words">高</b>
											</div>
										</div>
									</div>
								</li>

								<li>
									<div class="y_same_item">
										<input class="ysame_input" type="password"
											oncopy="return false;" oncut="return false;"
											onpaste="return false;" id="password2" /> <span
											class="y_same_label">确认密码</span>
									</div>

									<div class="y_regist_tips y_regist_tips_red">
										<div class="y_regtip_rel">
											<i></i>
											<div class="y_tips_words">请再次输入密码</div>
										</div>
									</div>

									<div class="y_regist_right"></div>
								</li>
								<li>
									<div class="y_agreement_word">
										点击注册，表示您同意1号店 <a
											href="http://cms.yhd.com/cms/view.do?topicId=24110"
											target="_blank">《服务协议》</a>
									</div> <a class="y_agreement_btn" onclick="javascript:document:register_form.submit();">同意协议并注册</a>
								</li>
							</ul>
						</div>
						<!-- // y_regist_form ending -->
					</form>
				</div>
			</div>
	<!--// y_regist_wrap ending -->
	<script type="text/javascript"
		src='https://captcha.yhd.com/captcha/js/api.js?0.1543943106'></script>

	<div class="regist_popWin regist_success_newst" id="sale_pop">
		<div class="regist_popWin_con">
			<div class="regist_popWin_title">
				<a href="javascript:void(0)" class="regist_popWin_closeBtn"></a>
			</div>
			<div class="regist_popWin_Info clearfix">
				<p class="tit">
					<i></i>注册成功
				</p>
				<p class="fuli">
					<b>0元抢、双倍积分、爆款低价</b>
				</p>
				<a href="http://cms.yhd.com/sale/180770" class="shopping_btn"
					data-tpa="2548">领取福利</a>
			</div>
		</div>
	</div>
	<div class="regist_success regist_popWin" id="default_pop">
		<div class="regist_popWin_con">
			<div class="regist_popWin_title">
				<a href="javascript:void(0)" class="regist_popWin_closeBtn"></a>
			</div>
			<div class="regist_popWin_Info clearfix">
				<div class="regist_popWin_main">
					<div class="regist_popWin_mainCon">
						<p class="tit">
							<i></i>注册成功
						</p>
					</div>
				</div>
			</div>
			<div class="popWin_tips">
				<span>3</span>s后跳转至首页
			</div>
		</div>
	</div>

	<div id="simplefooter">
		<a href="http://www.miibeian.gov.cn/" target="_blank">沪ICP备13044278号</a>|<a>合字B1.B2-20130004</a>|<a
			href="http://d7.yihaodianimg.com/N01/M04/14/0D/CgQCr1KgLjGAM5w3AAQiJTyDkdw48000.jpg"
			data-ref="YHD_Footer_Licence" target="_blank">营业执照</a>
		<p>Copyright &copy; 1号店网上超市 2007-2014，All Rights Reserved</p>
	</div>
	<div>
		<span style="color: #FFFFFF"> 117!$ 4%& 4#@ 10!$ , </span> <span
			style="color: #FFFFFF">1561453</span>
	</div>
	<script type="text/javascript"
		src="https://passport.yhd.com/front-homepage/global/js/global_tracker.js?1561453"></script>
</body>
<script type="text/javascript">
	var showValidCodeWhenRegistByMobile = false;
	var registerValidateUserBehaviorSwitcher = true;
	jRegist.init();
</script>
</html>

