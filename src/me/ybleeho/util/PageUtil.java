package me.ybleeho.util;

public class PageUtil {
	
	public static String getUpAndDownPagation(int totalNum,int currentPage,int pageSize,String typeId){
		int totalPage=totalNum%pageSize==0?totalNum/pageSize:totalNum/pageSize+1;
		StringBuffer pageCode=new StringBuffer();
		pageCode.append("<ul class='pager'>");
		if(currentPage==1){
			pageCode.append("<li class='disabled'><a href='#'>��һҳ</a></li>");
		}else{
			pageCode.append("<li><a href='artical?action=list&typeId="+typeId+"&page="+(currentPage-1)+"'>��һҳ</a></li>");			
		}
		pageCode.append("&nbsp;&nbsp;");
		if(currentPage==totalPage){
			pageCode.append("<li class='disabled'><a href='#'>��һҳ</a></li>");
		}else{
			pageCode.append("<li><a href='artical?action=list&typeId="+typeId+"&page="+(currentPage+1)+"'>��һҳ</a></li>");			
		}
		pageCode.append("</ul>");
		return pageCode.toString();
	}
}