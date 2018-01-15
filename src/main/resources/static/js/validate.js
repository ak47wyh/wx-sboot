/**
 * Created by junjiewan on 16/2/24.
 */
$(function(){
    $(".G-prompt-infor").bind({
        focus:function(){
            $(this).siblings(".G-p").hide();
        },
        blur:function(){
            var val = $(this).val();
            if(val == ""){
                $(this).siblings(".G-p").show();
            }
        }
    });
});