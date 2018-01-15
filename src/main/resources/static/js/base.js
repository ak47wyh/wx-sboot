/**
 * Created by junjiewan on 16/1/13.
 */
$(function(){
    //首页搜索
    $(".index-search-container .search-input input[type='search']").bind({
        focus:function(){
            $(this).parent().css("margin-right","38px").siblings(".search-btn").show();
            $(this).parentsUntil(".index-search-container").parent().siblings(".index-search-bg").show();
        }
    });
    $(".index-search-container .search-btn").bind({
        click:function(){
            $(this).hide().siblings(".search-input").css("margin-right","0");
            $(this).parent().siblings(".index-search-bg").hide();
        }
    });
    $(".index-search-bg .search-list dd").bind({
        click:function(){
            var thisVal = $(this).text();
            $(".index-search-container .search-input input[type='search']").val(thisVal);
        }
    });

    $(".g-star").each(function(){
        var inputval = $(this).find("input[type='hidden']").val();
        $(this).find("a:lt("+inputval+")").addClass("selected");
    });
    $(".pro-details-bottom .share").click(function(){
        $(".pro-details-share").show();
    });
    $(".pro-details-share .close").click(function(){
        $(this).parent().hide();
    });
    $(".pro-details-bottom .focus").click(function(){
        var current = $(this).hasClass("current");
        var text = $(this).find("span");
        if(current){
            $(this).removeClass("current");
            text.text("关注");
        }
        else{
            $(this).addClass("current");
            text.text("已关注");
        }
    });
    //产品详情页切换
    $(".producut-option").click(function(){
        $(".pro-details-nav li").removeClass("current").parent().find(".producut-option").addClass("current");
        $(".pro-details-tab dd[id!='producut-option']").animate({
            'margin-top': '0',
            'margin-left': '-100%',
            opacity: 'hide'
        }, 200).removeClass("current-tab");
        $(".pro-details-tab").find("#producut-option").animate({
            'margin-top': '0',
            'margin-left': '100%',
            opacity: 'hide'
        }, 0).animate({
            'margin-left': '0',
            'margin-top': '0',
            opacity: 'show'
        }, 200).addClass("current-tab");
        $(document.body).scrollTop(0);
    });
    $(".details-option").click(function(){
        $(".pro-details-nav li").removeClass("current").parent().find(".details-option").addClass("current");
        $(".pro-details-tab dd[id!='details-option']").animate({
            'margin-top': '0',
            'margin-left': '-100%',
            opacity: 'hide'
        }, 0).removeClass("current-tab");
        $(".pro-details-tab").find("#details-option").css({
            'margin-top': '0',
            'margin-left': '100%',
            opacity: 'hide'
        }).animate({
            'margin-left': '0',
            'margin-top': '0',
            opacity: 'show'
        }, 200).addClass("current-tab");
        $(document.body).scrollTop(0);
    });
    $(".evaluation-option").click(function(){
        $(".pro-details-nav li").removeClass("current").parent().find(".evaluation-option").addClass("current");
        $(".pro-details-tab dd[id!='evaluation-option']").animate({
            'margin-top': '0',
            'margin-left': '-100%',
            opacity: 'hide'
        }, 200).removeClass("current-tab");
        $(".pro-details-tab").find("#evaluation-option").animate({
            'margin-top': '0',
            'margin-left': '100%',
            opacity: 'hide'
        }, 0).animate({
            'margin-left': '0',
            'margin-top': '0',
            opacity: 'show'
        }, 200).addClass("current-tab");
        $(document.body).scrollTop(0);
    });
    //数量增减
    $(".pro-details-tab").delegate(".g-number-control a.add", "click",function(){
        var numValss = $(this).parent().find(".num");
        numValss.val(Number(numValss.val()) + 1);
    });
    $(".pro-details-tab").delegate(".g-number-control a.subtract", "click",function(){
        var numValss = $(this).parent().find(".num");
        if(numValss.val() > 1){
            numValss.val(Number(numValss.val()) - 1);
        }
    });
    $(".wrap").delegate(".g-number-control a.add", "click",function(){
        var numValss = $(this).parent().find(".num");
        numValss.val(Number(numValss.val()) + 1);
    });
    $(".wrap").delegate(".g-number-control a.subtract", "click",function(){
        var numValss = $(this).parent().find(".num");
        if(numValss.val() > 1){
            numValss.val(Number(numValss.val()) - 1);
        }
    });
    //评级
    $(".editor-star a").click(function(){
        var index = $(this).index();
        $(this).siblings("input[type='hidden']").val(index);
        $(this).parent().find("a").removeClass("selected");
        $(this).parent().find("a:lt("+index+")").addClass("selected");
    });
    //mui "a"标签重定向
    $('a').click(function(){
        var link = $(this).attr("href");
        window.location.href=link;
    });
    //tab切换
    $(".tabNav li").click(function(){
        var thisindex= $(this).index();
        var thissub = $(this).parent().attr("sub");
        $(this).addClass("active").siblings("li").removeClass("active");
        $("."+thissub).hide();
        $("."+thissub).eq(thisindex).show();
    });
    //评论短标签
    $("#review-cot .short-tag a").click(function(){
        var hasSelected = $(this).hasClass("selected");
        if(hasSelected){
            $(this).removeClass("selected");
        }
        else{
            $(this).addClass("selected");
        }
    });
    //产品介绍滑动到底部跳转到详情
    //$(window).scroll(function(){
    //    var upPullDetails = $(".pro-details-up-pull-details");
    //    var scrollBottomAction = $(".scroll-bottom-action");
    //    var windowHeight = $(window).height();
    //    var bodyScrollTop = $(document).scrollTop();
    //    var scrollHeight = document.body.scrollHeight;
    //    if(upPullDetails.is(":visible")){
    //        if(scrollBottomAction.is(":visible")){
    //            if(windowHeight+bodyScrollTop >= scrollHeight){
    //                upPullDetails.animate({
    //                    "padding-bottom": "20px",
    //                    "height": "20px",
    //                    "line-height": "20px"
    //                }, 300, function () {
    //                    $(".details-option").click();
    //                });
    //            }
    //            else if(windowHeight+bodyScrollTop <= scrollHeight-0){
    //                upPullDetails.stop().animate({
    //                    "height": "40px",
    //                    "line-height": "40px",
    //                    "padding-bottom": "0"
    //                }, 0, function () {
    //                    scrollBottomAction.hide();
    //                });
    //            }
    //        }
    //        else if(scrollBottomAction.is(":hidden")){
    //            if(windowHeight+bodyScrollTop >= scrollHeight){
    //                upPullDetails.animate({
    //                    "height": "40px",
    //                    "line-height": "40px",
    //                    "padding-bottom": "0"
    //                }, 200, function () {
    //                    scrollBottomAction.show();
    //                });
    //            }
    //        }
    //    }
    //});
});

