package gildedrose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void uploadQuality() {
//        String name = "foo";
//        int sellIn = 0;
//        int quality = 0;
//        GildedRose app = doUpdateQuality(name, sellIn, quality);
//        assertEquals("foo", app.items[0].name);
//        String itemString = app.items[0].toString();
//        Approvals.verify(itemString);
        CombinationApprovals.verifyAllCombinations(
                this::doUpdateQuality,
                new String[]{"foo","Aged Brie","Backstage passes to a TAFKAL80ETC concert","Sulfuras, Hand of Ragnaros"},
                new Integer[]{-1,0,2,6,11},
                new Integer[]{0,1,49,50}
        );
    }

    private String doUpdateQuality(String name, int sellIn, int quality) {
        Item[] items = new Item[]{Item.createItem(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return app.items[0].toString();
    }

}
