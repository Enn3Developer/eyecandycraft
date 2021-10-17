package eyecandycraft.main.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelAntenna80GHz extends ModelBase
{
  //fields
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer disco;
    ModelRenderer disco1;
    ModelRenderer disco2;
    ModelRenderer disco3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
  
  public ModelAntenna80GHz()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Shape1 = new ModelRenderer(this, 0, 13);
      Shape1.addBox(0F, 0F, 0F, 6, 6, 1);
      Shape1.setRotationPoint(-3F, 12F, 6F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 16, 0);
      Shape2.addBox(0F, 0F, 0F, 2, 10, 1);
      Shape2.setRotationPoint(-1F, 10F, 5F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 16, 0);
      Shape3.addBox(0F, 0F, 0F, 10, 2, 1);
      Shape3.setRotationPoint(-5F, 14F, 5F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0F, 0F, 0F);
      disco = new ModelRenderer(this, 0, 0);
      disco.addBox(0F, 0F, 0F, 2, 1, 1);
      disco.setRotationPoint(-1F, 11F, 4F);
      disco.setTextureSize(64, 32);
      disco.mirror = true;
      setRotation(disco, 0F, 0F, 0F);
      disco1 = new ModelRenderer(this, 0, 0);
      disco1.addBox(0F, 0F, 0F, 1, 2, 1);
      disco1.setRotationPoint(-4F, 14F, 4F);
      disco1.setTextureSize(64, 32);
      disco1.mirror = true;
      setRotation(disco1, 0F, 0F, 0F);
      disco2 = new ModelRenderer(this, 0, 0);
      disco2.addBox(0F, 0F, 0F, 1, 2, 1);
      disco2.setRotationPoint(3F, 14F, 4F);
      disco2.setTextureSize(64, 32);
      disco2.mirror = true;
      setRotation(disco2, 0F, 0F, 0F);
      disco3 = new ModelRenderer(this, 0, 0);
      disco3.addBox(0F, 0F, 0F, 2, 1, 1);
      disco3.setRotationPoint(-1F, 18F, 4F);
      disco3.setTextureSize(64, 32);
      disco3.mirror = true;
      setRotation(disco3, 0F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 0, 0);
      Shape4.addBox(0F, 0F, 0F, 4, 6, 1);
      Shape4.setRotationPoint(-2F, 12F, 4F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 0, 0);
      Shape5.addBox(0F, 0F, 0F, 6, 4, 1);
      Shape5.setRotationPoint(-3F, 13F, 4F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Shape1.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    disco.render(f5);
    disco1.render(f5);
    disco2.render(f5);
    disco3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }

}