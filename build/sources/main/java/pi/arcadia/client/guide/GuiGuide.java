package main.java.pi.arcadia.client.guide;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.resources.I18n;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
/*
 * http://www.minecraftforge.net/forum/topic/60065-112-custom-book-mouse-cursor-not-visible-upon-opening/#comment-279862
 * http://jabelarminecraft.blogspot.se/p/minecraft-modding-block-with-simple-gui.html
 * */
public class GuiGuide extends GuiScreen {
	private final int HEIGHT = 192;
	private final int WIDTH = 192;
	private static final int bookTotalPages = 4;
	private static ResourceLocation[] bookPageTexture = new ResourceLocation[bookTotalPages];
	private static String[] stringText = new String[bookTotalPages];

	private GuiButton buttonDone;
	private NextPageButton buttonNextPage;
	private NextPageButton buttonPreviousPage;
	private int currentPage = 0;


	public GuiGuide() {
		bookPageTexture[0] =  new ResourceLocation("Arcadia:textures/gui/book_cover.png");
		bookPageTexture[1] = new ResourceLocation("Arcadia:textures/gui/book.png");
		bookPageTexture[2] = new ResourceLocation("Arcadia:textures/gui/book.png");
		bookPageTexture[3] = new ResourceLocation("Arcadia:textures/gui/book.png");
		stringText[0] = "";
		stringText[1] = "Page 1 Stuff";
		stringText[2] = "Page 2 Stuff";
		stringText[3] = "Page 3 Stuff";
	}

	/**
	 * Adds the buttons (and other controls) to the screen in question.
	 */
	@Override
	public void initGui() 
	{
		System.out.println(Mouse.isGrabbed());
		buttonList.clear();
		Keyboard.enableRepeatEvents(true);

		buttonDone = new GuiButton(0, width / 2 + 2, 4 + HEIGHT, 
				98, 20, I18n.format("gui.done", new Object[0]));

		buttonList.add(buttonDone);
		int offsetFromScreenLeft = (width - WIDTH) / 2;
		buttonList.add(buttonNextPage = new NextPageButton(1, 
				offsetFromScreenLeft + 120, 156, true));
		buttonList.add(buttonPreviousPage = new NextPageButton(2, 
				offsetFromScreenLeft + 38, 156, false));
	}

	/**
	 * Called from the main game loop to update the screen.
	 */
	@Override
	public void updateScreen() 
	{
		buttonDone.visible = (currentPage == bookTotalPages - 1);
		buttonNextPage.visible = (currentPage < bookTotalPages - 1);
		buttonPreviousPage.visible = currentPage > 0;
		super.updateScreen();
	}

	/**
	 * Draws the screen and all the components in it.
	 */
	@Override
	public void drawScreen(int parWidth, int parHeight, float p_73863_3_)
	{
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		if (currentPage == 0)
		{
			mc.getTextureManager().bindTexture(bookPageTexture[0]);
		}
		else
		{
			mc.getTextureManager().bindTexture(bookPageTexture[1]);
		}
		int offsetFromScreenLeft = (width - WIDTH ) / 2;
		drawTexturedModalRect(offsetFromScreenLeft, 2, 0, 0, WIDTH, 
				HEIGHT);
		int widthOfString;
		String stringPageIndicator = I18n.format("book.pageIndicator", 
				new Object[] {Integer.valueOf(currentPage + 1), bookTotalPages});
		widthOfString = this.fontRenderer.getStringWidth(stringPageIndicator);
		this.fontRenderer.drawString(stringPageIndicator, 
				offsetFromScreenLeft - widthOfString + WIDTH - 44, 
				18, 0);
		this.fontRenderer.drawSplitString(stringText[currentPage], 
				offsetFromScreenLeft + 36, 34, 116, 0);
		super.drawScreen(parWidth, parHeight, p_73863_3_);

	}
	
	
	/**
	 * Called when a mouse button is pressed and the mouse is moved around. 
	 * Parameters are : mouseX, mouseY, lastButtonClicked & 
	 * timeSinceMouseClick.
	 */
	@Override
	protected void mouseClickMove(int parMouseX, int parMouseY, 
			int parLastButtonClicked, long parTimeSinceMouseClick) 
	{

	}

	@Override
	protected void actionPerformed(GuiButton parButton) 
	{
		if (parButton == buttonDone)
		{
			mc.displayGuiScreen((GuiScreen)null);
		}
		else if (parButton == buttonNextPage)
		{
			if (currentPage < bookTotalPages - 1)
			{
				++currentPage;
			}
		}
		else if (parButton == buttonPreviousPage)
		{
			if (currentPage > 0)
			{
				--currentPage;
			}
		}
	}


	/**
	 * Called when the screen is unloaded. Used to disable keyboard repeat 
	 * events
	 */
	@Override
	public void onGuiClosed() 
	{
		Keyboard.enableRepeatEvents(false);
	}


	/**
	 * Returns true if this GUI should pause the game when it is displayed in 
	 * single-player
	 */
	@Override
	public boolean doesGuiPauseGame()
	{
		return false;
	}

	@SideOnly(Side.CLIENT)
	static class NextPageButton extends GuiButton
	{
		private final boolean isNextButton;

		public NextPageButton(int parButtonId, int parPosX, int parPosY, 
				boolean parIsNextButton)
		{
			super(parButtonId, parPosX, parPosY, 23, 13, "");
			isNextButton = parIsNextButton;
		}

		/**
		 * Draws this button to the screen.
		 */
		@Override
		public void drawButton(Minecraft mc, int parX, int parY, float partialTicks)
		{
			if (visible)
			{
				boolean isButtonPressed = (parX >= this.x 
						&& parY >= this.y 
						&& parX < this.x + width 
						&& parY < this.y + height);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				mc.getTextureManager().bindTexture(bookPageTexture[1]);
				int textureX = 0;
				int textureY = 192;

				if (isButtonPressed)
				{
					textureX += 23;
				}

				if (!isNextButton)
				{
					textureY += 13;
				}

				drawTexturedModalRect(this.x, this.y, 
						textureX, textureY, 
						23, 13);
			}
		}
	}



}
