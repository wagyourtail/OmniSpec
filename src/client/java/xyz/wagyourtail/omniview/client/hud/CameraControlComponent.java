package xyz.wagyourtail.omniview.client.screen.component;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.gui.components.AbstractWidget;
import net.minecraft.client.gui.narration.NarrationElementOutput;
import net.minecraft.network.chat.Component;
import xyz.wagyourtail.omniview.client.hud.ViewWindow;

public class CameraControlComponent extends AbstractWidget {
    public ViewWindow window;


    public CameraControlComponent(ViewWindow window, Component arg) {
        super(window.x1(), window.y1(), window.x2() - window.x1(), window.y2() - window.y1(), arg);
    }

    @Override
    public void renderWidget(PoseStack stack, int mouseX, int mouseY, float f) {
        if (isHovered) {
            fill(stack, getX(), getY(), getX() + width, getY() + height, 0x30000000);

            // draw name top left

        }
    }

    @Override
    protected void updateWidgetNarration(NarrationElementOutput arg) {

    }
}
