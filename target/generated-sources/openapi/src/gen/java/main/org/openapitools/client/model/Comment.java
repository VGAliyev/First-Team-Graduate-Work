/*
 * API Documentation
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * Comment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-01T20:26:45.495594900+03:00[Europe/Moscow]", comments = "Generator version: 7.6.0")
public class Comment {
  public static final String SERIALIZED_NAME_AUTHOR = "author";
  @SerializedName(SERIALIZED_NAME_AUTHOR)
  private Integer author;

  public static final String SERIALIZED_NAME_AUTHOR_IMAGE = "authorImage";
  @SerializedName(SERIALIZED_NAME_AUTHOR_IMAGE)
  private String authorImage;

  public static final String SERIALIZED_NAME_AUTHOR_FIRST_NAME = "authorFirstName";
  @SerializedName(SERIALIZED_NAME_AUTHOR_FIRST_NAME)
  private String authorFirstName;

  public static final String SERIALIZED_NAME_CREATED_AT = "createdAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private Long createdAt;

  public static final String SERIALIZED_NAME_PK = "pk";
  @SerializedName(SERIALIZED_NAME_PK)
  private Integer pk;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public Comment() {
  }

  public Comment author(Integer author) {
    this.author = author;
    return this;
  }

   /**
   * id автора комментария
   * @return author
  **/
  @javax.annotation.Nullable
  public Integer getAuthor() {
    return author;
  }

  public void setAuthor(Integer author) {
    this.author = author;
  }


  public Comment authorImage(String authorImage) {
    this.authorImage = authorImage;
    return this;
  }

   /**
   * ссылка на аватар автора комментария
   * @return authorImage
  **/
  @javax.annotation.Nullable
  public String getAuthorImage() {
    return authorImage;
  }

  public void setAuthorImage(String authorImage) {
    this.authorImage = authorImage;
  }


  public Comment authorFirstName(String authorFirstName) {
    this.authorFirstName = authorFirstName;
    return this;
  }

   /**
   * имя создателя комментария
   * @return authorFirstName
  **/
  @javax.annotation.Nullable
  public String getAuthorFirstName() {
    return authorFirstName;
  }

  public void setAuthorFirstName(String authorFirstName) {
    this.authorFirstName = authorFirstName;
  }


  public Comment createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * дата и время создания комментария в миллисекундах с 00:00:00 01.01.1970
   * @return createdAt
  **/
  @javax.annotation.Nullable
  public Long getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public Comment pk(Integer pk) {
    this.pk = pk;
    return this;
  }

   /**
   * id комментария
   * @return pk
  **/
  @javax.annotation.Nullable
  public Integer getPk() {
    return pk;
  }

  public void setPk(Integer pk) {
    this.pk = pk;
  }


  public Comment text(String text) {
    this.text = text;
    return this;
  }

   /**
   * текст комментария
   * @return text
  **/
  @javax.annotation.Nullable
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Comment comment = (Comment) o;
    return Objects.equals(this.author, comment.author) &&
        Objects.equals(this.authorImage, comment.authorImage) &&
        Objects.equals(this.authorFirstName, comment.authorFirstName) &&
        Objects.equals(this.createdAt, comment.createdAt) &&
        Objects.equals(this.pk, comment.pk) &&
        Objects.equals(this.text, comment.text);
  }

  @Override
  public int hashCode() {
    return Objects.hash(author, authorImage, authorFirstName, createdAt, pk, text);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Comment {\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    authorImage: ").append(toIndentedString(authorImage)).append("\n");
    sb.append("    authorFirstName: ").append(toIndentedString(authorFirstName)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    pk: ").append(toIndentedString(pk)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("author");
    openapiFields.add("authorImage");
    openapiFields.add("authorFirstName");
    openapiFields.add("createdAt");
    openapiFields.add("pk");
    openapiFields.add("text");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to Comment
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Comment.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Comment is not found in the empty JSON string", Comment.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Comment.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Comment` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("authorImage") != null && !jsonObj.get("authorImage").isJsonNull()) && !jsonObj.get("authorImage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorImage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorImage").toString()));
      }
      if ((jsonObj.get("authorFirstName") != null && !jsonObj.get("authorFirstName").isJsonNull()) && !jsonObj.get("authorFirstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `authorFirstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("authorFirstName").toString()));
      }
      if ((jsonObj.get("text") != null && !jsonObj.get("text").isJsonNull()) && !jsonObj.get("text").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `text` to be a primitive type in the JSON string but got `%s`", jsonObj.get("text").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Comment.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Comment' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Comment> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Comment.class));

       return (TypeAdapter<T>) new TypeAdapter<Comment>() {
           @Override
           public void write(JsonWriter out, Comment value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Comment read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Comment given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Comment
  * @throws IOException if the JSON string is invalid with respect to Comment
  */
  public static Comment fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Comment.class);
  }

 /**
  * Convert an instance of Comment to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

