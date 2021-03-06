<div class="col-md-3 left_col">
    <div class="left_col scroll-view">
        <div class="navbar nav_title" style="border: 0;">
            <jsp:include page="../web/top-left-icon.jsp"/>
        </div>

        <div class="clearfix"></div>

        <!-- menu profile quick info -->
        <div class="profile">
            <div class="profile_pic">
                <img src="images/img.jpg" alt="..." class="img-circle profile_img">
            </div>
            <div class="profile_info">
                <span>Welcome,</span>
                <h2>${user.name()}</h2>
            </div>
        </div>
        <!-- /menu profile quick info -->

        <br />

        <!-- sidebar menu -->
        <div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
            <div class="menu_section">
                <h3>Menu</h3>
                <ul class="nav side-menu">
                    <li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="./handler?command=PatientProfile">Profile</a></li>
                            <li><a href="./handler?command=PatientDoctorProfile">Doctor</a></li>
                        </ul>
                    </li>
                    <li><a><i class="fa fa-edit"></i> Samples <span class="fa fa-chevron-down"></span></a>
                        <ul class="nav child_menu">
                            <li><a href="./handler?command=Upload">Upload</a></li>
                            <li><a href="./handler?command=PatientProfile">Stats</a></li>
                        </ul>
                </ul>
            </div>

        </div>
        <!-- /sidebar menu -->
    </div>
</div>