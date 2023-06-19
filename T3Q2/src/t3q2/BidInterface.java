package t3q2;

interface BidInterface {
    /**
     * Returns the name of the company making this bid.
     *
     * @return the name of the company making this bid.
     */
    public String getCompanyName();

    /**
     * Returns the description of the air conditioner that this bid is for.
     *
     * @return the description of the air conditioner that this bid is for.
     */
    public String getACDescription();

    /**
     * Returns the capacity of this bid's AC in tons.
     *
     * @return the capacity of this bid's AC in tons.
     */
    public double getACCapacity();

    /**
     * Returns the seasonal efficiency of this bid's AC (SEER).
     *
     * @return the seasonal efficiency of this bid's AC.
     */
    public double getACSEER();

    /**
     * Returns the cost of this bid's AC.
     *
     * @return the cost of this bid's AC.
     */
    public double getACCost();

    /**
     * Returns the cost of installing this bid's AC.
     *
     * @return the cost of installing this bid's AC.
     */
    public double getInstallationCost();

    /**
     * Returns the yearly cost of operating this bid's AC.
     *
     * @return the yearly cost of operating this bid's AC.
     */
    public double getYearlyOperatingCost(double averageHours, double energyCost);
}

interface BidCollectionInterface {

    /**
     * Adds a bid to this collection.
     *
     * @param bid the bid to add to this collection.
     */
    public void addBid(BidInterface bid);

    /**
     * Returns the bid in this collection with the best yearly cost.
     *
     * @return the bid in this collection with the best yearly cost.
     */
    public BidInterface getBestYearlyCostBid(double averageHours, double energyCost);

    /**
     * Returns the bid in this collection with the best initial cost. The initial cost will be defined as the unit cost plus the installation cost.
     *
     * @return the bid in this collection with the best initial cost.
     */
    public BidInterface getBestInitialCostBid();

    /**
     * Clears all of the bids from this collection.
     */
    public void clearBids();

    /**
     * Gets the number of bids in this collection.
     *
     * @return the number of bids in this collection.
     */
    public int getNumberOfBids();
    
    /**
     * See whether the collection is empty or not by returning true or false.
     */
    public boolean isEmpty();
}

