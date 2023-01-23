import { TestBed } from '@angular/core/testing';

import { SloginService } from './slogin.service';

describe('SloginService', () => {
  let service: SloginService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SloginService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
