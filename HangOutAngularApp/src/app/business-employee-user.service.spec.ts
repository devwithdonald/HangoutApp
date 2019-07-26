import { TestBed } from '@angular/core/testing';

import { BusinessEmployeeUserService } from './business-employee-user.service';

describe('BusinessEmployeeUserService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: BusinessEmployeeUserService = TestBed.get(BusinessEmployeeUserService);
    expect(service).toBeTruthy();
  });
});
