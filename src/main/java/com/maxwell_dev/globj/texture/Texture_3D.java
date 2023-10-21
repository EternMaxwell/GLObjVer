package globj.texture;

import globj.Texture;

import static org.lwjgl.opengl.GL45.*;


public class Texture_3D extends Texture {
    /**
     * create a new texture 3d obj
     */
    public Texture_3D() {
        super(GL_TEXTURE_3D);
    }

    /**
     * get the texture image obj
     * @return the texture image obj
     */
    public TextureImage3D textureImage() {
        return textureImage3D();
    }

    /**
     * get the texture sub image obj
     * @return the texture sub image obj
     */
    public TextureSubImage3D textureSubImage() {
        return textureSubImage3D();
    }
}
