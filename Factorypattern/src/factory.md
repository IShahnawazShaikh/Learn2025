# Factory Design Pattern
  ### Supplier
      - Dynamically registers new shapes
      - Create objects when needed (Lazy initialization)
  ### NormalCircle::new
      - new NormalCircle() will call constructor immediately but 
        NormalCircle::new stores a reference to a contructor
      - When factory calls .get(), invoke constructor to instance.
  
  #### Note: This factory design pattern follows Open closed principle as its open for extension but closed for modifications.