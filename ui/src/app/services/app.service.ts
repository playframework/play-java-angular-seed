import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import 'rxjs/add/operator/map'

@Injectable()
/**
 * Class representing application service.
 *
 * @class AppService.
 */
export class AppService {
  private serviceUrl = '/test';

  constructor(private http: HttpClient) {
  }

  /**
   * Makes a http get request to retrieve the welcome message.
   */
  public getWelcomeMessage() {
    return this.http.get(this.serviceUrl)
      .map(response => response)
  }
}
