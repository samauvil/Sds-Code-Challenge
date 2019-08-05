package Challenge.SDS.Sam.model;

public class Item
{
    private String name;
    private Integer sellIn;
    private Integer quality;

    public Item(String name, Integer sellIn, Integer quality)
    {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Integer getSellIn()
    {
        return sellIn;
    }

    public void setSellIn(Integer sellIn)
    {
        this.sellIn = sellIn;
    }

    public Integer getQuality()
    {
        return quality;
    }

    public void setQuality(Integer quality)
    {
        this.quality = quality;
    }
}
