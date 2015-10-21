package laketahoefunfacts.caverocktech.com.funfactstahoe.ui;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import laketahoefunfacts.caverocktech.com.funfactstahoe.R;
import laketahoefunfacts.caverocktech.com.funfactstahoe.model.Facts;
import laketahoefunfacts.caverocktech.com.funfactstahoe.model.Page;

public class FactActivity extends AppCompatActivity {

    private Facts mFacts = new Facts();
    private ImageView mImageView;
    private TextView mTextView;
    private Button mChoiceOne;
    private Page mCurrentPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fact);



        mImageView = (ImageView)findViewById(R.id.factImageView);
        mTextView = (TextView)findViewById(R.id.factTextView);
        mChoiceOne= (Button)findViewById(R.id.choiceButtonOne);

        loadPage(0);

    }

    private  void  loadPage(int choice){
         mCurrentPage = mFacts.getPage(choice);

        Drawable drawable = getResources().getDrawable(mCurrentPage.getImageId());
        mImageView.setImageDrawable(drawable);

        mTextView.setText(mCurrentPage.getText());

        if(mCurrentPage.isFinal()){
//            mChoiceOne.setVisibility(View.INVISIBLE);
            //chages the text to revert back to the start
            mChoiceOne.setText("StartOver");
            mChoiceOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //takes us back
                    finish();
                }
            });
        }
        else {
            mChoiceOne.setText(mCurrentPage.getChoice1().getText());

            mChoiceOne.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int nextPage = mCurrentPage.getChoice1().getNextPage();
                    loadPage(nextPage);
                }
            });
        }
    }


}
