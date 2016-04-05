package net.DieberShowsAwesomeStuff.ElectronEra;



import java.io.IOException;

import net.minecraft.block.Block;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;
import net.minecraft.tileentity.TileEntity;

public class DataSettingGui extends GuiScreen{
	
	private GuiScreen parentScreen;
   	private GuiButton btnClose;
   	private GuiTextField tfInput;
   	private GuiButton btnSure;
   	private int dataFromOutPutTextBox;

   	
   	
    public DataSettingGui(GuiScreen parent)
    {
         parentScreen = parent;
         //记下是哪个界面打开了它,以便以后返回那个界面
         //在这里初始化与界面无关的数据,或者是只需初始化一次的数据.
    }

    
    public void initGui()
    {
        //每当界面被打开时调用
        //这里部署控件
    	buttonList.add(btnClose = new GuiButton(0, (int)(width*0.75), (int)(height*0.40), 80, 20, "关闭"));
    	buttonList.add(btnSure = new GuiButton(0, (int)(width*0.25), (int)(height*0.40), 80, 20, "确认"));

    	tfInput = new GuiTextField(dataFromOutPutTextBox, fontRendererObj, (int)(width*0.5)-150, (int)(height*0.20), 300, 20);
    	tfInput.setMaxStringLength(64); //设置最大长度,可省略
    	tfInput.setFocused(false); //设置是否为焦点
    	tfInput.setCanLoseFocus(true); //设置为可以被取消焦点
    	
    	
    }

    public void drawScreen(int par1, int par2, float par3)
    {
        drawDefaultBackground();

        
        //在这里绘制文本或纹理等非控件内容,这里绘制的东西会被控件(即按键)盖住.
        super.drawScreen(par1,par2,par3);
        //在这里绘制文本或纹理等非控件内容,这里绘制的东西会盖在控件(即按键)之上.
        tfInput.drawTextBox();

    }

	@Override
	protected void actionPerformed(GuiButton button) {
	    if(button == btnClose){ //改成button.id==0也行
	        mc.displayGuiScreen(parentScreen);
	    }
	    else if (button == btnSure){
	    	if(tfInput.getText() != ""){
		    	if(0<Integer.parseInt(tfInput.getText())&&
		    	     Integer.parseInt(tfInput.getText())<10){
		    		setDataFromOutPutTextBox(Integer.parseInt(tfInput.getText()));
		    		mc.displayGuiScreen(parentScreen);
		    	}
		    	else{
		    		setDataFromOutPutTextBox(0);
		    		mc.displayGuiScreen(parentScreen);
		    	}
	    	}
	    	else{
	    		mc.displayGuiScreen(parentScreen);
	    	}
	    	
	}
}
	
	@Override
	protected void keyTyped(char par1, int par2) {
	    if(tfInput.textboxKeyTyped(par1, par2)) //向文本框传入输入的内容
	        return;
	    try {
			super.keyTyped(par1, par2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	@Override
	protected void mouseClicked(int par1, int par2, int par3) {
	    tfInput.mouseClicked(par1, par2, par3); //调用文本框的鼠标点击检查
	    try {
			super.mouseClicked(par1, par2, par3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 
	public int getDataFromOutPutTextBox(){
		return dataFromOutPutTextBox;
	}
	
	
	
	public void setDataFromOutPutTextBox(int data){
		dataFromOutPutTextBox =  data;
	}
	
	
	
	
}
