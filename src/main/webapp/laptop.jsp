<%--
  Created by IntelliJ IDEA.
  User: HOME
  Date: 11/18/2021
  Time: 5:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"
           uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <link rel="stylesheet" href="assets/css/laptop.css">
    <link rel="stylesheet" href="assets/css/reset.css">
    <link rel="stylesheet"
          href="assets/font/fontawesome-free-5.15.4-web%20(1)/fontawesome-free-5.15.4-web/css/all.css">


    <title>Laptop</title>
</head>
<body>
<div class="main">
    <div class="header">
        <div class="decrip-header-main">
            <div class="logo">
                <img src="https://w.ladicdn.com/5bf3dc7edc60303c34e4991f/logo-02-20200903083638.svg" alt="">
            </div>
            <div class="decrip-header">
                <div class="decrip-header-left">
                    <a href="#">Trả góp</a>
                    <a href="#">Bảo hành</a>
                    <a href="#">Liên hệ</a>
                </div>
                <div class="decrip-header-right">
                    <div>
                        <i class="fas fa-phone-square-alt"></i>
                        <div>
                            <a href="">Tư vấn</a>
                            <span>1800 6975</span>
                        </div>
                    </div>
                    <div>
                        <i class="far fa-clock"></i>
                        <div>
                            <a href="">Giờ làm việc</a>
                            <span>9h00 - 19h00</span>
                        </div>
                    </div>


                </div>
            </div>
        </div>
    </div>
    <div class="banner">
        <div class="img-banner">

        </div>
    </div>
    <div class="container">
        <div class="product">
            <div class="decrip-product">
                <jsp:useBean id="product" scope="request" type="java.util.List"/>
                <c:forEach var="p" items="${product}">
                    <div class="item-product">
                        <img src="${p.img}" alt="">
                        <div class="text-product">
                            <h3>${p.name}</h3>
                            <h5>${p.decription}</h5>
                            <div class="config">
                                <div>
                                    <p>CPU</p>
                                    <span>i3 1007G1</span>
                                </div>
                                <div>
                                    <p>Ram</p>
                                    <span>4G</span>
                                </div>
                                <div>
                                    <p>SSD</p>
                                    <span>256GB</span>
                                </div>

                            </div>
                            <div class="price">
                                <div class="old-price">
                                        ${p.newPrice}
                                </div>
                                <div class="new-price">
                                        ${p.oldPrice}
                                </div>
                            </div>
                        </div>
                    </div>
                </c:forEach>
            </div>
        </div>

    </div>
    <div class="footer">
        <div class="footer-page">
            <div class="footer-page-decription">
                <div class="user1">
                    <h4>CÔNG TY TNHH THƯƠNG MẠI GEARVN</h4>
                    <h4>EMAIL: CSKH@GEARVN.COM</h4>
                    <h4>HỆ THỐNG TỔNG ĐÀI MIỄN PHÍ:
                        <p>(Làm việc từ 09h00 - 19h00)</p>
                    </h4>
                    <div class="cskh">
                        <p>
                            Gọi mua hàng
                        </p>
                        <h5>1800 6975</h5>
                    </div>
                    <div class="cskh">
                        <p>
                            Hỗ trợ khách hàng
                        </p>
                        <h5>1800 6173</h5>
                    </div>
                    <ul>
                        <li><a href="">Chính sách bảo hành</a></li>
                        <li><a href="">Chính sách thanh toán</a></li>
                        <li><a href="">Chính sách giao hàng</a></li>
                        <li><a href="">Chính sách bảo mật</a></li>
                    </ul>
                    <img src="https://theme.hstatic.net/1000026716/1000440777/14/20150827110756-dathongbao.png" alt="">
                </div>
                <div class="user2">
                    <a href="">Hệ thống cửa hàng</a>
                    <h4>SHOWROOM HCM
                        <p>(Làm việc từ 9h00 - 19h00)</p>
                    </h4>
                    <p>- Địa chỉ 1: 78-80-82 Hoàng Hoa Thám, Phường 12, Quận Tân Bình.</p>
                    <h4>SHOWROOM HN
                        <p>(Làm việc từ 9h00 - 19h00)</p>
                    </h4>
                    <p>- Địa chỉ : 37 Ngõ 121 Thái Hà, Phường Trung Liệt, Quận Đống Đa.</p>
                    <div>
                        Mua
                        <a href="">PC Gaming</a>,
                        <a href="">laptop gaming</a>,
                        <a href="">card màn hình</a>,
                        <a href="">màn hình máy tính</a>,
                        <a href="">ghế gaming</a>
                        thiết bị chơi game như PS5 hàng đầu Việt Nam bảo hành chính hãng. Mua online nhận nhiều ưu đãi
                        hấp dẫn.
                    </div>
                    <ul>
                        <li>- Công ty TNHH Thương Mại Gearvn</li>
                        <li>- GPKD số 0316517394 do Sở KH và ĐT TP Hồ Chí Minh cấp ngày 01/10/2020</li>
                        <li>- GĐ/Sở hữu website: Nguyễn Thế Anh</li>
                    </ul>
                    <img src="https://images.dmca.com/Badges/dmca_protected_sml_120m.png?ID=65147526-7602-46be-9047-e8c33f9fcbd3"
                         alt="">


                </div>
                <!-- <div class="user3">
                    <a href="beta.html">link beta</a>
                    Lorem ipsum dolor sit amet consectetur adipisicing elit. Numquam quidem consectetur autem, eius quae sapiente reiciendis dolorum alias odio impedit neque, corporis, quas nam ex architecto hic repudiandae explicabo? Amet.
                </div> -->
            </div>


        </div>
    </div>
</div>
</body>
</html>
