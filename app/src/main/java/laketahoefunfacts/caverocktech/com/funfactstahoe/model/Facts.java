package laketahoefunfacts.caverocktech.com.funfactstahoe.model;

import laketahoefunfacts.caverocktech.com.funfactstahoe.R;

/**
 * Created by ryanr on 10/21/2015.
 */
public class Facts {
    private Page[] mPages;

    public Facts() {
        mPages= new Page[4];

        mPages[0] = new Page
                (R.mipmap.mountain_lion,
                "The mountain lion is also known as cougar, panther, or puma. Body coloration can range from tan to gray and cubs are usually covered with blackish brown spots. Adult range from 7 to 8 feet long (from the tip of the nose to the tip of the tail), and can weigh between 65 and 150 pounds.  ",
                        new Choice("Next Fact",1)
                );

        mPages[1] = new Page
                (R.mipmap.tahoe_mountain,
                "The glorius peaks that surround Lake Tahoe are mountains of granite. This light gray, medium to coarse-grained rock is prevalent in the Sierra Nevada Mountains, along with other igneous rocks and metamorphic slate.  ",
                        new Choice("Next Fact",2)
                );

        mPages[2] = new Page
                (R.mipmap.tahoe_keys,
                "it's important to protect all lands in Tahoe, not just meadows, because of the value of their soil to watershed health. Tahoe’s soils are threatened by overdevelopment. Compacted surfaces such as roads, sidewalks, parking lots, driveways, buildings, and dirt paths and parking areas prevent soils from functioning at all.\n",
                        new Choice("Next Fact",3)
                );

        mPages[3] = new Page
                (R.mipmap.porcupine,
                        "The Porcupine is the largest member of the rodent family. When alarmed it turns a way, erects the quills, humps the body, and swings its stout tail. If any quills touch an inquiring dog, wildcat, or person, the barbed tips lodge in the enemy's skin. The Porcupine is active mainly at night, when it feeds on the succulent inner bark of conifers."

        );

    }

    public Page getPage (int pageNumber){
        return mPages[pageNumber];
    }
}
