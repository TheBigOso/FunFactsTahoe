package laketahoefunfacts.caverocktech.com.funfactstahoe.model;

/**
 * Created by ryanr on 10/21/2015.
 */
public class Page {

    private int mImageId;
    private String mText;
    private Choice mChoice1;

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setIsFinal(boolean isFinal) {
        mIsFinal = isFinal;
    }

    private boolean mIsFinal = false;

    public Page(int imageId, String text, Choice choice1){
        mImageId = imageId;
        mText = text;
        mChoice1 = choice1;

    }

    public Page(int imageId, String text){
        mImageId = imageId;
        mText = text;
        mChoice1 = null;
        mIsFinal = true;

    }

    public int getImageId() {
        return mImageId;
    }

    public void setImageId(int imageId) {
        mImageId = imageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }



}
