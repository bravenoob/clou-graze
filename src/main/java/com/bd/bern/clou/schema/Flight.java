/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.bd.bern.clou.schema;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
@org.apache.avro.specific.AvroGenerated
public class Flight extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -2924335927039010245L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Flight\",\"namespace\":\"com.bd.bern.clou.schema\",\"fields\":[{\"name\":\"icao24\",\"type\":\"string\"},{\"name\":\"velocity\",\"type\":[\"null\",\"double\"],\"default\":null},{\"name\":\"verticalRate\",\"type\":[\"null\",\"double\"],\"default\":null}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Flight> ENCODER =
      new BinaryMessageEncoder<Flight>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Flight> DECODER =
      new BinaryMessageDecoder<Flight>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Flight> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Flight> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Flight>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Flight to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Flight from a ByteBuffer. */
  public static Flight fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  @Deprecated public java.lang.CharSequence icao24;
  @Deprecated public java.lang.Double velocity;
  @Deprecated public java.lang.Double verticalRate;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Flight() {}

  /**
   * All-args constructor.
   * @param icao24 The new value for icao24
   * @param velocity The new value for velocity
   * @param verticalRate The new value for verticalRate
   */
  public Flight(java.lang.CharSequence icao24, java.lang.Double velocity, java.lang.Double verticalRate) {
    this.icao24 = icao24;
    this.velocity = velocity;
    this.verticalRate = verticalRate;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return icao24;
    case 1: return velocity;
    case 2: return verticalRate;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: icao24 = (java.lang.CharSequence)value$; break;
    case 1: velocity = (java.lang.Double)value$; break;
    case 2: verticalRate = (java.lang.Double)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'icao24' field.
   * @return The value of the 'icao24' field.
   */
  public java.lang.CharSequence getIcao24() {
    return icao24;
  }

  /**
   * Sets the value of the 'icao24' field.
   * @param value the value to set.
   */
  public void setIcao24(java.lang.CharSequence value) {
    this.icao24 = value;
  }

  /**
   * Gets the value of the 'velocity' field.
   * @return The value of the 'velocity' field.
   */
  public java.lang.Double getVelocity() {
    return velocity;
  }

  /**
   * Sets the value of the 'velocity' field.
   * @param value the value to set.
   */
  public void setVelocity(java.lang.Double value) {
    this.velocity = value;
  }

  /**
   * Gets the value of the 'verticalRate' field.
   * @return The value of the 'verticalRate' field.
   */
  public java.lang.Double getVerticalRate() {
    return verticalRate;
  }

  /**
   * Sets the value of the 'verticalRate' field.
   * @param value the value to set.
   */
  public void setVerticalRate(java.lang.Double value) {
    this.verticalRate = value;
  }

  /**
   * Creates a new Flight RecordBuilder.
   * @return A new Flight RecordBuilder
   */
  public static com.bd.bern.clou.schema.Flight.Builder newBuilder() {
    return new com.bd.bern.clou.schema.Flight.Builder();
  }

  /**
   * Creates a new Flight RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Flight RecordBuilder
   */
  public static com.bd.bern.clou.schema.Flight.Builder newBuilder(com.bd.bern.clou.schema.Flight.Builder other) {
    return new com.bd.bern.clou.schema.Flight.Builder(other);
  }

  /**
   * Creates a new Flight RecordBuilder by copying an existing Flight instance.
   * @param other The existing instance to copy.
   * @return A new Flight RecordBuilder
   */
  public static com.bd.bern.clou.schema.Flight.Builder newBuilder(com.bd.bern.clou.schema.Flight other) {
    return new com.bd.bern.clou.schema.Flight.Builder(other);
  }

  /**
   * RecordBuilder for Flight instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Flight>
    implements org.apache.avro.data.RecordBuilder<Flight> {

    private java.lang.CharSequence icao24;
    private java.lang.Double velocity;
    private java.lang.Double verticalRate;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.bd.bern.clou.schema.Flight.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.icao24)) {
        this.icao24 = data().deepCopy(fields()[0].schema(), other.icao24);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.velocity)) {
        this.velocity = data().deepCopy(fields()[1].schema(), other.velocity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.verticalRate)) {
        this.verticalRate = data().deepCopy(fields()[2].schema(), other.verticalRate);
        fieldSetFlags()[2] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Flight instance
     * @param other The existing instance to copy.
     */
    private Builder(com.bd.bern.clou.schema.Flight other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.icao24)) {
        this.icao24 = data().deepCopy(fields()[0].schema(), other.icao24);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.velocity)) {
        this.velocity = data().deepCopy(fields()[1].schema(), other.velocity);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.verticalRate)) {
        this.verticalRate = data().deepCopy(fields()[2].schema(), other.verticalRate);
        fieldSetFlags()[2] = true;
      }
    }

    /**
      * Gets the value of the 'icao24' field.
      * @return The value.
      */
    public java.lang.CharSequence getIcao24() {
      return icao24;
    }

    /**
      * Sets the value of the 'icao24' field.
      * @param value The value of 'icao24'.
      * @return This builder.
      */
    public com.bd.bern.clou.schema.Flight.Builder setIcao24(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.icao24 = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'icao24' field has been set.
      * @return True if the 'icao24' field has been set, false otherwise.
      */
    public boolean hasIcao24() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'icao24' field.
      * @return This builder.
      */
    public com.bd.bern.clou.schema.Flight.Builder clearIcao24() {
      icao24 = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'velocity' field.
      * @return The value.
      */
    public java.lang.Double getVelocity() {
      return velocity;
    }

    /**
      * Sets the value of the 'velocity' field.
      * @param value The value of 'velocity'.
      * @return This builder.
      */
    public com.bd.bern.clou.schema.Flight.Builder setVelocity(java.lang.Double value) {
      validate(fields()[1], value);
      this.velocity = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'velocity' field has been set.
      * @return True if the 'velocity' field has been set, false otherwise.
      */
    public boolean hasVelocity() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'velocity' field.
      * @return This builder.
      */
    public com.bd.bern.clou.schema.Flight.Builder clearVelocity() {
      velocity = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'verticalRate' field.
      * @return The value.
      */
    public java.lang.Double getVerticalRate() {
      return verticalRate;
    }

    /**
      * Sets the value of the 'verticalRate' field.
      * @param value The value of 'verticalRate'.
      * @return This builder.
      */
    public com.bd.bern.clou.schema.Flight.Builder setVerticalRate(java.lang.Double value) {
      validate(fields()[2], value);
      this.verticalRate = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'verticalRate' field has been set.
      * @return True if the 'verticalRate' field has been set, false otherwise.
      */
    public boolean hasVerticalRate() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'verticalRate' field.
      * @return This builder.
      */
    public com.bd.bern.clou.schema.Flight.Builder clearVerticalRate() {
      verticalRate = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Flight build() {
      try {
        Flight record = new Flight();
        record.icao24 = fieldSetFlags()[0] ? this.icao24 : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.velocity = fieldSetFlags()[1] ? this.velocity : (java.lang.Double) defaultValue(fields()[1]);
        record.verticalRate = fieldSetFlags()[2] ? this.verticalRate : (java.lang.Double) defaultValue(fields()[2]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Flight>
    WRITER$ = (org.apache.avro.io.DatumWriter<Flight>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Flight>
    READER$ = (org.apache.avro.io.DatumReader<Flight>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}
