/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.jobs.v2.model;

/**
 * Output only.
 *
 * Custom numeric bucketing result.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NumericBucketingResult extends com.google.api.client.json.GenericJson {

  /**
   * Count within each bucket. Its size is the length of NumericBucketingOption.bucket_bounds plus
   * 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BucketizedCount> counts;

  static {
    // hack to force ProGuard to consider BucketizedCount used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(BucketizedCount.class);
  }

  /**
   * Stores the maximum value of the numeric field. Will be populated only if
   * [NumericBucketingOption.requires_min_max] is set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double maxValue;

  /**
   * Stores the minimum value of the numeric field. Will be populated only if
   * [NumericBucketingOption.requires_min_max] is set to true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double minValue;

  /**
   * Count within each bucket. Its size is the length of NumericBucketingOption.bucket_bounds plus
   * 1.
   * @return value or {@code null} for none
   */
  public java.util.List<BucketizedCount> getCounts() {
    return counts;
  }

  /**
   * Count within each bucket. Its size is the length of NumericBucketingOption.bucket_bounds plus
   * 1.
   * @param counts counts or {@code null} for none
   */
  public NumericBucketingResult setCounts(java.util.List<BucketizedCount> counts) {
    this.counts = counts;
    return this;
  }

  /**
   * Stores the maximum value of the numeric field. Will be populated only if
   * [NumericBucketingOption.requires_min_max] is set to true.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMaxValue() {
    return maxValue;
  }

  /**
   * Stores the maximum value of the numeric field. Will be populated only if
   * [NumericBucketingOption.requires_min_max] is set to true.
   * @param maxValue maxValue or {@code null} for none
   */
  public NumericBucketingResult setMaxValue(java.lang.Double maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Stores the minimum value of the numeric field. Will be populated only if
   * [NumericBucketingOption.requires_min_max] is set to true.
   * @return value or {@code null} for none
   */
  public java.lang.Double getMinValue() {
    return minValue;
  }

  /**
   * Stores the minimum value of the numeric field. Will be populated only if
   * [NumericBucketingOption.requires_min_max] is set to true.
   * @param minValue minValue or {@code null} for none
   */
  public NumericBucketingResult setMinValue(java.lang.Double minValue) {
    this.minValue = minValue;
    return this;
  }

  @Override
  public NumericBucketingResult set(String fieldName, Object value) {
    return (NumericBucketingResult) super.set(fieldName, value);
  }

  @Override
  public NumericBucketingResult clone() {
    return (NumericBucketingResult) super.clone();
  }

}
