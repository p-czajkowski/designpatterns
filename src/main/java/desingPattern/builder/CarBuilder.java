package desingPattern.builder;

public class CarBuilder {

    private Color color;
    private int engineCapacity;
    private int engintPower;
    private Body body;
    private String naviSystem;

    public CarBuilder(Builder builder) {
        this.color = builder.color;
        this.engineCapacity = builder.engineCapacity;
        this.engintPower = builder.engintPower;
        this.body = builder.body;
        this.naviSystem = builder.naviSystem;
    }

    public Color getColor() {
        return color;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    public int getEngintPower() {
        return engintPower;
    }

    public Body getBody() {
        return body;
    }

    public String getNaviSystem() {
        return naviSystem;
    }

    @Override
    public String toString() {
        return "CarBuilder{" +
                "color='" + color + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", engintPower=" + engintPower +
                ", body='" + body +
                ", naviSystem='" + naviSystem + '\'' +
                '}';
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder {

        private Color color;
        private int engineCapacity;
        private int engintPower;
        private Body body;
        private String naviSystem;

        private Builder() {}

        public Builder color(Color color) {
            this.color = color;
            return this;
        }

        public Builder engineCapacity(int engineCapacity){
            this.engineCapacity = engineCapacity;
            return this;
        }

        public Builder enginePower(int engintPower) {
            this.engintPower = engintPower;
            return this;
        }

        public Builder body(Body body){
            this.body = body;
            return this;
        }

        public CarBuilder build(){
            return new CarBuilder(this);
        }

    }
}

