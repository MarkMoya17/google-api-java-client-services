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

package com.google.api.services.firestore.v1.model;

/**
 * The response for Firestore.Write.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WriteResponse extends com.google.api.client.json.GenericJson {

  /**
   * The time at which the commit occurred. Any read with an equal or greater `read_time` is
   * guaranteed to see the effects of the write.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String commitTime;

  /**
   * The ID of the stream. Only set on the first message, when a new stream was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streamId;

  /**
   * A token that represents the position of this response in the stream. This can be used by a
   * client to resume the stream at this point.
   *
   * This field is always set.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String streamToken;

  /**
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<WriteResult> writeResults;

  /**
   * The time at which the commit occurred. Any read with an equal or greater `read_time` is
   * guaranteed to see the effects of the write.
   * @return value or {@code null} for none
   */
  public String getCommitTime() {
    return commitTime;
  }

  /**
   * The time at which the commit occurred. Any read with an equal or greater `read_time` is
   * guaranteed to see the effects of the write.
   * @param commitTime commitTime or {@code null} for none
   */
  public WriteResponse setCommitTime(String commitTime) {
    this.commitTime = commitTime;
    return this;
  }

  /**
   * The ID of the stream. Only set on the first message, when a new stream was created.
   * @return value or {@code null} for none
   */
  public java.lang.String getStreamId() {
    return streamId;
  }

  /**
   * The ID of the stream. Only set on the first message, when a new stream was created.
   * @param streamId streamId or {@code null} for none
   */
  public WriteResponse setStreamId(java.lang.String streamId) {
    this.streamId = streamId;
    return this;
  }

  /**
   * A token that represents the position of this response in the stream. This can be used by a
   * client to resume the stream at this point.
   *
   * This field is always set.
   * @see #decodeStreamToken()
   * @return value or {@code null} for none
   */
  public java.lang.String getStreamToken() {
    return streamToken;
  }

  /**
   * A token that represents the position of this response in the stream. This can be used by a
   * client to resume the stream at this point.
   *
   * This field is always set.
   * @see #getStreamToken()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeStreamToken() {
    return com.google.api.client.util.Base64.decodeBase64(streamToken);
  }

  /**
   * A token that represents the position of this response in the stream. This can be used by a
   * client to resume the stream at this point.
   *
   * This field is always set.
   * @see #encodeStreamToken()
   * @param streamToken streamToken or {@code null} for none
   */
  public WriteResponse setStreamToken(java.lang.String streamToken) {
    this.streamToken = streamToken;
    return this;
  }

  /**
   * A token that represents the position of this response in the stream. This can be used by a
   * client to resume the stream at this point.
   *
   * This field is always set.
   * @see #setStreamToken()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public WriteResponse encodeStreamToken(byte[] streamToken) {
    this.streamToken = com.google.api.client.util.Base64.encodeBase64URLSafeString(streamToken);
    return this;
  }

  /**
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the request.
   * @return value or {@code null} for none
   */
  public java.util.List<WriteResult> getWriteResults() {
    return writeResults;
  }

  /**
   * The result of applying the writes.
   *
   * This i-th write result corresponds to the i-th write in the request.
   * @param writeResults writeResults or {@code null} for none
   */
  public WriteResponse setWriteResults(java.util.List<WriteResult> writeResults) {
    this.writeResults = writeResults;
    return this;
  }

  @Override
  public WriteResponse set(String fieldName, Object value) {
    return (WriteResponse) super.set(fieldName, value);
  }

  @Override
  public WriteResponse clone() {
    return (WriteResponse) super.clone();
  }

}
