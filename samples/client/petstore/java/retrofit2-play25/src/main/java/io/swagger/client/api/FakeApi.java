package io.swagger.client.api;

import io.swagger.client.CollectionFormats.*;



import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;

import java.math.BigDecimal;
import io.swagger.client.model.Client;
import io.swagger.client.model.OuterComposite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import java.util.concurrent.*;
import retrofit2.Response;

public interface FakeApi {
  /**
   * 
   * Test serialization of outer boolean types
   * @param body Input boolean as post body (optional)
   * @return Call&lt;Boolean&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("fake/outer/boolean")
  CompletionStage<Response<Boolean>> fakeOuterBooleanSerialize(
                    @retrofit2.http.Body Boolean body    
  );

  /**
   * 
   * Test serialization of object with outer number type
   * @param body Input composite as post body (optional)
   * @return Call&lt;OuterComposite&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("fake/outer/composite")
  CompletionStage<Response<OuterComposite>> fakeOuterCompositeSerialize(
                    @retrofit2.http.Body OuterComposite body    
  );

  /**
   * 
   * Test serialization of outer number types
   * @param body Input number as post body (optional)
   * @return Call&lt;BigDecimal&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("fake/outer/number")
  CompletionStage<Response<BigDecimal>> fakeOuterNumberSerialize(
                    @retrofit2.http.Body BigDecimal body    
  );

  /**
   * 
   * Test serialization of outer string types
   * @param body Input string as post body (optional)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @POST("fake/outer/string")
  CompletionStage<Response<String>> fakeOuterStringSerialize(
                    @retrofit2.http.Body String body    
  );

  /**
   * To test \&quot;client\&quot; model
   * To test \&quot;client\&quot; model
   * @param body client model (required)
   * @return Call&lt;Client&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @PATCH("fake")
  CompletionStage<Response<Client>> testClientModel(
                    @retrofit2.http.Body Client body    
  );

  /**
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * Fake endpoint for testing various parameters 假端點 偽のエンドポイント 가짜 엔드 포인트 
   * @param body  (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json; charset=utf-8"
  })
  @POST("fake")
  CompletionStage<Response<Void>> testEndpointParameters(
                    @retrofit2.http.Body Object body    
  );

  /**
   * To test enum parameters
   * To test enum parameters
   * @param body  (optional)
   * @param enumHeaderStringArray Header parameter enum test (string array) (optional)
   * @param enumHeaderString Header parameter enum test (string) (optional)
   * @param enumQueryStringArray Query parameter enum test (string array) (optional)
   * @param enumQueryString Query parameter enum test (string) (optional)
   * @param enumQueryInteger Query parameter enum test (double) (optional)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:*/*"
  })
  @GET("fake")
  CompletionStage<Response<Void>> testEnumParameters(
                    @retrofit2.http.Body Object body    ,             @retrofit2.http.Header("enum_header_string_array") List<String> enumHeaderStringArray        ,             @retrofit2.http.Header("enum_header_string") String enumHeaderString        ,     @retrofit2.http.Query("enum_query_string_array") List<String> enumQueryStringArray                ,     @retrofit2.http.Query("enum_query_string") String enumQueryString                ,     @retrofit2.http.Query("enum_query_integer") Integer enumQueryInteger                
  );

  /**
   * test inline additionalProperties
   * 
   * @param body request body (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("fake/inline-additionalProperties")
  CompletionStage<Response<Void>> testInlineAdditionalProperties(
                    @retrofit2.http.Body Map<String, String> body    
  );

  /**
   * test json serialization of form data
   * 
   * @param body  (required)
   * @return Call&lt;Void&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @GET("fake/jsonFormData")
  CompletionStage<Response<Void>> testJsonFormData(
                    @retrofit2.http.Body Object body    
  );

}
