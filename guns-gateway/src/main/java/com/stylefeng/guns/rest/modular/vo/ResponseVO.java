package com.stylefeng.guns.rest.modular.vo;

/**
 * @Author: ZhangYang
 * @Date: 2019/7/5 13:36
 */
public class ResponseVO<M> {

    private int status;  //返回状态  0-成功  1-业务失败  999-系统异常
    private String msg;  //返回信息
    private M data;  //数据实体
    private String imgPre; //图片前缀

    //分页使用
    private int nowPage;
    private int totalPage;
    private ResponseVO(){}

    public static<M> ResponseVO success(M m){
        ResponseVO responseVO=new ResponseVO();
        responseVO.setStatus(0);
        responseVO.setData(m);

        return responseVO;
    }

    public static<M> ResponseVO success(String message){
        ResponseVO responseVO=new ResponseVO();
        responseVO.setStatus(0);
        responseVO.setMsg(message);

        return responseVO;
    }
    public static<M> ResponseVO success(String imgPre,M m){
        ResponseVO responseVO=new ResponseVO();
        responseVO.setStatus(0);
        responseVO.setData(m);
        responseVO.setImgPre(imgPre);

        return responseVO;
    }
    public static<M> ResponseVO success(int nowPage,int totalPage,String imgPre,M m){
        ResponseVO responseVO=new ResponseVO();
        responseVO.setStatus(0);
        responseVO.setData(m);
        responseVO.setImgPre(imgPre);
        responseVO.setNowPage(nowPage);
        responseVO.setTotalPage(totalPage);

        return responseVO;
    }
    public static<M> ResponseVO serviceFail(String message){
        ResponseVO responseVO=new ResponseVO();
        responseVO.setStatus(1);
        responseVO.setMsg(message);
        return responseVO;
    }

    public static<M> ResponseVO appFail(String message){
        ResponseVO responseVO=new ResponseVO();
        responseVO.setStatus(999);
        responseVO.setMsg(message);
        return responseVO;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public M getData() {
        return data;
    }

    public void setData(M data) {
        this.data = data;
    }

    public String getImgPre() {
        return imgPre;
    }

    public void setImgPre(String imgPre) {
        this.imgPre = imgPre;
    }

    public int getNowPage() {
        return nowPage;
    }

    public void setNowPage(int nowPage) {
        this.nowPage = nowPage;
    }

    public int getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(int totalPage) {
        this.totalPage = totalPage;
    }
}
